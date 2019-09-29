grammar RefLang;
import RecLang;



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
        | lam=lambdaexp { $ast = $lam.ast; }
        | call=callexp { $ast = $call.ast; }
        | i=ifexp { $ast = $i.ast; }
        | less=lessexp { $ast = $less.ast; }
        | eq=equalexp { $ast = $eq.ast; }
        | gt=greaterexp { $ast = $gt.ast; }
        | car=carexp { $ast = $car.ast; }
        | cdr=cdrexp { $ast = $cdr.ast; }
        | cons=consexp { $ast = $cons.ast; }
        | list=listexp { $ast = $list.ast; }
        | nl=nullexp { $ast = $nl.ast; }
        | lrec=letrecexp { $ast = $lrec.ast; }
        | ref=refexp { $ast = $ref.ast; }
        | deref=derefexp { $ast = $deref.ast; }
        | assign=assignexp { $ast = $assign.ast; }
        | free=freeexp { $ast = $free.ast; }
        ;

refexp returns [RefExp ast] :
    '(' Ref
        e=exp
    ')' { $ast = new RefExp($e.ast); }
    ;

derefexp returns [DerefExp ast] :
    '(' Deref
        e=exp
    ')' { $ast = new DerefExp($e.ast); }
    ;

assignexp returns [AssignExp ast] :
    '(' Assign
        e=exp e1=exp
    ')' { $ast = new AssignExp($e.ast, $e1.ast); }
    ;

freeexp returns [FreeExp ast] :
    '(' Free
        e=exp
    ')' { $ast = new FreeExp($e.ast); }
    ;