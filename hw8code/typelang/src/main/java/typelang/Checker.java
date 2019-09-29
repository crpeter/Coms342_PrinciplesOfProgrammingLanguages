package typelang;

import java.util.ArrayList;
import java.util.List;

import typelang.AST.*;
import typelang.Env.ExtendEnv;
import typelang.Env.GlobalEnv;
import typelang.Type.*;

public class Checker implements Visitor<Type,Env<Type>> {
	Printer.Formatter ts = new Printer.Formatter();
	Env<Type> initEnv = initialEnv(); //New for definelang
	
	private Env<Type> initialEnv() {
		GlobalEnv<Type> initEnv = new GlobalEnv<Type>();
		
		/* Type for procedure: (read <filename>). Following is same as (define read (lambda (file) (read file))) */
		List<Type> formalTypes = new ArrayList<Type>();
		formalTypes.add(new Type.StringT());
		initEnv.extend("read", new Type.FuncT(formalTypes, new Type.StringT()));

		/* Type for procedure: (require <filename>). Following is same as (define require (lambda (file) (eval (read file)))) */
		formalTypes = new ArrayList<Type>();
		formalTypes.add(new Type.StringT());
		initEnv.extend("eval", new Type.FuncT(formalTypes, new Type.UnitT()));
		
		/* Add type for new built-in procedures here */ 
		
		return initEnv;
	}
	
    Type check(Program p) {
		return (Type) p.accept(this, null);
	}

	public Type visit(Program p, Env<Type> env) {
		Env<Type> new_env = initEnv;

		for (DefineDecl d: p.decls()) {
			Type type = (Type)d.accept(this, new_env);

			if (type instanceof ErrorT) { return type; }

			Type dType = d.type();

			if (!type.typeEqual(dType)) {
				return new ErrorT("Expected " + dType + " found " + type + " in " + ts.visit(d, null));
			}

			new_env = new ExtendEnv<Type>(new_env, d.name(), dType);
		}
		return (Type) p.e().accept(this, new_env);
	}

	public Type visit(VarExp e, Env<Type> env) {
		try {
			return env.get(e.name());
		} catch(Exception ex) {
			return new ErrorT("Variable " + e.name() +
					" has not been declared in " + ts.visit(e, null));
		}
	}

	public Type visit(LetExp e, Env<Type> env) {
		List<String> names = e.names();
		List<Exp> value_exps = e.value_exps();
		List<Type> types = e.varTypes();
		List<Type> values = new ArrayList<Type>(value_exps.size());

		int i = 0;
		for (Exp exp : value_exps) {
			Type type = (Type)exp.accept(this, env);
			if (type instanceof ErrorT) { return type; }

			Type argType = types.get(i);
			if (!type.typeEqual(argType)) {
				return new ErrorT("The declared type of the " + i +
						" let variable and the actual type mismatch, expect " +
						argType.tostring() + " found " + type.tostring() +
						" in " + ts.visit(e, null));
			}

			values.add(type);
			i++;
		}

		Env<Type> new_env = env;
		for (int index = 0; index < names.size(); index++)
			new_env = new ExtendEnv<Type>(new_env, names.get(index),
					values.get(index));

		return (Type) e.body().accept(this, new_env);		
	}

	public Type visit(DefineDecl d, Env<Type> env) {
		String name = d.name();
		Type t =(Type) d._value_exp.accept(this, env);
		((GlobalEnv<Type>) initEnv).extend(name, t);
		return t;
	}

	public Type visit(LambdaExp e, Env<Type> env) {
		List<String> names = e.formals();
		List<Type> types = e.types();
		String message = "The number of formal parameters and the number of "
				+ "arguments in the function type do not match in ";
		if (types.size() == names.size()) {
			Env<Type> new_env = env;
			int index = 0;
			for (Type argType : types) {
				new_env = new ExtendEnv<Type>(new_env, names.get(index),
						argType);
				index++;
			}

			Type bodyType = (Type) e.body().accept(this, new_env);
			return new FuncT(types,bodyType);
		}
		return new ErrorT(message + ts.visit(e, null));
	}

	public Type visit(CallExp e, Env<Type> env) {
		Exp op = e.operator();
		List<Exp> values = e.operands();

		Type opType = (Type)op.accept(this, env);
		if (opType instanceof ErrorT) {
			return opType;
		}
		if (!(opType instanceof FuncT)) {
			return new ErrorT("Expect a function type in the call expression, found " + opType.tostring() +
					" in "+ ts.visit(e, null));
		}
		int index = 0;
		Type tBase = (Type)values.get(0).accept(this, env);
		for (Exp k: values) {
			Type current = (Type)k.accept(this, env);
			if (current instanceof ErrorT) {
				return current;
			}
			if (!(current.typeEqual(tBase))) {
				return new ErrorT("the expected type fo the " + index + " element is " + tBase.tostring() +
						" but found " + current.tostring() + " in " + ts.visit(e, null));
			}
			index++;
		}
		return tBase;
	}

	public Type visit(LetrecExp e, Env<Type> env) {
		List<String> names = e.names();
		List<Type> types = e.types();
		List<Exp> fun_exps = e.fun_exps();

		// collect the environment
		Env<Type> new_env = env;
		for (int index = 0; index < names.size(); index++) {
			new_env = new ExtendEnv<Type>(new_env, names.get(index),
					types.get(index));
		}

		// verify the types of the variables
		for (int index = 0; index < names.size(); index++) {
			Type type = (Type)fun_exps.get(index).accept(this, new_env);

			if (type instanceof ErrorT) { return type; }

			if (!assignable(types.get(index), type)) {
				return new ErrorT("The expected type of the " + index +
						" variable is " + types.get(index).tostring() +
						" found " + type.tostring() + " in " +
						ts.visit(e, null));
			}
		}

		return (Type) e.body().accept(this, new_env);
	}

	public Type visit(IfExp e, Env<Type> env) {
		Exp e1 = e.conditional();
		Type t1 = (Type) e1.accept(this, env);
		if (t1 instanceof ErrorT) {
			return t1;
		}

		Type t2 = (Type)e.else_exp().accept(this, env);
		Type t3 = (Type)e.then_exp().accept(this, env);

		if (t2 instanceof ErrorT) {
			return t2;
		} else if (t3 instanceof ErrorT) {
			return t3;
		}
		return new ErrorT("dont call if");
	}

	public Type visit(CarExp e, Env<Type> env) {
		Exp e1 = e.arg();
		Type t1 = (Type)e1.accept(this, env);
		if (t1 instanceof ErrorT) {
			return t1;
		} else if (t1 instanceof PairT) {
			return ((PairT)t1).fst();
		}
		return new ErrorT("The car expect an expression of type Pair," +
				" found " +t1.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(CdrExp e, Env<Type> env) {
		Exp exp = e.arg();
		Type type = (Type)exp.accept(this, env);
		if (type instanceof ErrorT) { return type; }

		if (type instanceof PairT) {
			PairT pt = (PairT)type;
			return pt.snd();
		}

		return new ErrorT("The cdr expect an expression of type Pair, found "
				+ type.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(ConsExp e, Env<Type> env) {
		Exp fst = e.fst(); 
		Exp snd = e.snd();

		Type t1 = (Type)fst.accept(this, env);
		if (t1 instanceof ErrorT) { return t1; }

		Type t2 = (Type)snd.accept(this, env);
		if (t2 instanceof ErrorT) { return t2; }

		return new PairT(t1, t2);
	}

	public Type visit(ListExp e, Env<Type> env) {
		//System.out.println("e: " + e.elems());
		List<Exp> items = e.elems();
		Type t1 = e.type();

		int i = -1;
		for (Exp k: items) {
			i++;
			Type currentType = (Type) k.accept(this, env);
			if (currentType instanceof ErrorT) {
				return currentType;
			} else if (!t1.typeEqual(currentType)) {
				return new ErrorT("The " + i + " expression should have type " + t1.tostring() +
						" found " + currentType.tostring() + " in " + ts.visit(e, null));
			}
		}
		return new ListT(t1);
	}

	public Type visit(NullExp e, Env<Type> env) {
		Exp arg = e.arg();
		Type type = (Type)arg.accept(this, env);
		if (type instanceof ErrorT) { return type; }

		if (type instanceof ListT) { return BoolT.getInstance(); }

		return new ErrorT("The null? expect an expression of type List, found "
				+ type.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(RefExp e, Env<Type> env) {
		Exp value = e.value_exp();
		Type type = e.type();
		Type expType = (Type)value.accept(this, env);
		if (type instanceof ErrorT) { return type; }

		if (expType.typeEqual(type)) {
			return new RefT(type);
		}

		return new ErrorT("The Ref expression expect type " + type.tostring() +
				" found " + expType.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(DerefExp e, Env<Type> env) {
		Exp exp = e.loc_exp();
		Type t = (Type) exp.accept(this, env);
		if (t instanceof ErrorT) {
			return t;
		} else if (t instanceof RefT) {
			return ((RefT) t).nestType();
		} else {
			return new ErrorT("didn't find a reference type found: " + t.tostring());
		}
	}

	public Type visit(AssignExp e, Env<Type> env) {
		Exp e1 = e.lhs_exp();
		Type t1 = (Type)e1.accept(this, env);
		Exp e2 = e.rhs_exp();
		Type t2 = (Type)e2.accept(this, env);
		Type nested_t = ((RefT)t1).nestType();
		if (t1 instanceof ErrorT) {
			return t1;
		} else if (t1 instanceof RefT) {
			if (t2 instanceof ErrorT) {
				return t2;
			} else if (t2.typeEqual(nested_t)) { return t2; }
		}
		return new ErrorT("The inner type of the reference type is bool the rhs type is: " + t2.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(FreeExp e, Env<Type> env) {
		Exp exp = e.value_exp();
		Type type = (Type)exp.accept(this, env);

		if (type instanceof ErrorT) { return type; }

		if (type instanceof RefT) { return UnitT.getInstance(); }

		return new ErrorT("The free expression expect a reference type " +
				"found " + type.tostring() + " in " + ts.visit(e, null));
	}

	public Type visit(UnitExp e, Env<Type> env) {
		return Type.UnitT.getInstance();
	}

	public Type visit(NumExp e, Env<Type> env) {
		return NumT.getInstance();
	}

	public Type visit(StrExp e, Env<Type> env) {
		return Type.StringT.getInstance();
	}

	public Type visit(BoolExp e, Env<Type> env) {
		return Type.BoolT.getInstance();
	}

	public Type visit(LessExp e, Env<Type> env) {
		return visitBinaryComparator(e, env, ts.visit(e, null));
	}

	public Type visit(EqualExp e, Env<Type> env) {
		return visitBinaryComparator(e, env, ts.visit(e, null));
	}

	public Type visit(GreaterExp e, Env<Type> env) {
		return visitBinaryComparator(e, env, ts.visit(e, null));
	}

	private Type visitBinaryComparator(BinaryComparator e, Env<Type> env, String printNode) {
		Exp e1 = e.first_exp();
		Type t1 = (Type) e1.accept(this, env);
		if (t1 instanceof ErrorT) {
			return t1;
		}

		Exp e2 = e.second_exp();
		Type t2 = (Type) e2.accept(this, env);
		if (t2 instanceof ErrorT) {
			return t1;
		}

		if (!(t1 instanceof NumT)) {
			return new ErrorT("first argument of binary expression should be num type found " + t1.tostring() +
					" in " + printNode);
		}

		if (!(t1 instanceof NumT)) {
			return new ErrorT("second argument of binary expression should be num type found " + t1.tostring() +
					" in " + printNode);
		}

		return BoolT.getInstance();
	}


	public Type visit(AddExp e, Env<Type> env) {
		return visitCompoundArithExp(e, env, ts.visit(e, null));
	}

	public Type visit(DivExp e, Env<Type> env) {
		return visitCompoundArithExp(e, env, ts.visit(e, null));
	}

	public Type visit(MultExp e, Env<Type> env) {
		return visitCompoundArithExp(e, env, ts.visit(e, null));
	}

	public Type visit(SubExp e, Env<Type> env) {
		return visitCompoundArithExp(e, env, ts.visit(e, null));
	}

	private Type visitCompoundArithExp(CompoundArithExp e, Env<Type> env, String printNode) {
		System.out.println("e: " + e.all());
		List<Exp> values = e.all();

		for(Exp k: values) {
			Type current = (Type)k.accept(this, env);
			if (current instanceof ErrorT) {
				return current;
			} else if (!(current instanceof NumT)) {
				return new ErrorT("expected num found " + current.tostring() + " in " + printNode);
			}
		}
		return NumT.getInstance();
	}

	private static boolean assignable(Type t1, Type t2) {
		if (t2 instanceof UnitT) { return true; }

		return t1.typeEqual(t2);
	}
	
	public Type visit(ReadExp e, Env<Type> env) {
		return UnitT.getInstance();
	}

	public Type visit(EvalExp e, Env<Type> env) {
		return UnitT.getInstance();
	}
}
