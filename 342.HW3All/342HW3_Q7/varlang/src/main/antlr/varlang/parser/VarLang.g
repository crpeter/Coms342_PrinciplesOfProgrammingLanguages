grammar VarLang;

import ArithLang; //Import all rules from Arithlang grammar.
 
 // New elements in the Grammar of this Programming Language
 //  - grammar rules start with lowercase

 exp returns [Exp ast]:
		v=varexp { $ast = $v.ast; }
		| n=numexp { $ast = $n.ast; }
        | a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
        | p = leteexp{ $ast = $p.ast; }
        ;


 varexp returns [VarExp ast]: 
 		id=Identifier { $ast = new VarExp($id.text); }
 		;

 leteexp returns [LeteExp ast]
          locals [ArrayList<String> names, ArrayList<Exp> value_exps, NumExp enc, NumExp dec]
          @init { $names = new ArrayList<String>(); $value_exps = new ArrayList<Exp>(); $enc = new NumExp(0); } :
          '(' ( Lete e=exp
              { $enc=(NumExp)$e.ast; } )
              '(' ( '(' id=Identifier e=exp ')' { $names.add($id.text); $value_exps.add($e.ast); } )+  ')'
              '(' ( Dec e=exp body=exp ')' { $dec=(NumExp)$e.ast; } )
              ')' { $ast = new LeteExp($enc, $dec, $names, $value_exps, $body.ast); }
          ;



 Lete : 'lete' ;
 Dec : 'dec' ;
 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase