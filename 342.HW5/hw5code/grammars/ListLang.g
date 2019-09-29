grammar ListLang;

 import DefineLang; //Import all rules from Definelang grammar.
 
 exp returns [Exp ast]: 
		va=varexp { $ast = $va.ast; }
		| num=numexp { $ast = $num.ast; }
		| str=strexp { $ast = $str.ast; }
		| bl=boolexp { $ast = $bl.ast; }
        | add=addexp { $ast = $add.ast; }
        | sub=subexp { $ast = $sub.ast; }
        | mul=multexp { $ast = $mul.ast; }
        | div=divexp { $ast = $div.ast; }
        | let=letexp { $ast = $let.ast; }
        | car=carexp { $ast = $car.ast; }
        | cdr=cdrexp { $ast = $cdr.ast; }
        | cons=consexp { $ast = $cons.ast; }
        | list=listexp { $ast = $list.ast; }
        | nl=nullexp { $ast = $nl.ast; }
        | nu=numberexp { $ast = $nu.ast; }
        | b=booleanexp { $ast = $b.ast; }
        | s=stringexp { $ast = $s.ast; }
        | p=procedureexp { $ast = $p.ast; }
        | l=list_exp { $ast = $l.ast; }
        | pex=pairexp { $ast = $pex.ast; }
        ;

 carexp returns [CarExp ast] :
 		'(' Car 
 		    e=exp 
 		')' { $ast = new CarExp($e.ast); }
 		;

 cdrexp returns [CdrExp ast] :
 		'(' Cdr 
 		    e=exp 
 		')' { $ast = new CdrExp($e.ast); }
 		;

 consexp returns [ConsExp ast] :
 		'(' Cons 
 		    e1=exp 
 			e2=exp 
 		')' { $ast = new ConsExp($e1.ast,$e2.ast); }
 		;

 listexp returns [ListExp ast] 
        locals [ArrayList<Exp> list]
 		@init { $list = new ArrayList<Exp>(); } :
 		'(' List 
 		    ( e=exp { $list.add($e.ast); } )* 
 		')' { $ast = new ListExp($list); }
 		;

 nullexp returns [NullExp ast] :
 		'(' Null 
 		    e=exp 
 		')' { $ast = new NullExp($e.ast); }
 		;
 numberexp returns [NumberExp ast] :
        '(' Number
            e=exp
        ')' { $ast = new NumberExp($e.ast); }
         ;
 booleanexp returns [BooleanExp ast] :
         '(' Boolean
             e=exp
         ')' { $ast = new BooleanExp($e.ast); }
          ;
 stringexp returns [StringExp ast] :
         '(' String
             e=exp
         ')' { $ast = new StringExp($e.ast); }
          ;

 procedureexp returns [ProcedureExp ast] :
         '(' Procedure
             e=exp
         ')' { $ast = new ProcedureExp($e.ast); }
          ;

 list_exp returns [List_Exp ast] :
          '(' List
              e=exp
          ')' { $ast = new List_Exp($e.ast); }
           ;

 pairexp returns [PairExp ast] :
           '(' Pair
               e=exp
           ')' { $ast = new PairExp($e.ast); }
            ;
 strexp returns [StrExp ast] :
 		s=StrLiteral { $ast = new StrExp($s.text); } 
 		;

 boolexp returns [BoolExp ast] :
 		TrueLiteral { $ast = new BoolExp(true); } 
 		| FalseLiteral { $ast = new BoolExp(false); } 
 		;
  		