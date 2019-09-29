5 a)

$ (deref (ref 1))
1
$ (free (ref 1))
loc: 2
$ (let ((loc (ref 1))) (set! loc 2))
2
$ (let ((loc (ref 3))) (set! loc (deref loc)))
3

5 b)

1.

$ (define alias (ref 342))
$ (define alias_alias alias)
$ alias_alias
loc: 0
$ 

2.

$ (define loc (ref 342))
$ (define lov_val (deref loc))
$ (define loc2 (ref 20))
$ (set! loc (deref loc2))
20
$ (set! loc2 lov_val)
342

5 c)

i)
(Define list (ref 1))

ii)

(define add (lambda (head ele)
	(if (null? (deref (snd head)))
		   (deref (fst head))
	    (set! (Head ele))
	    (add (deref (head ele))))

iii)

(define print (lambda (head) 
	(if (null? (deref head))
		   (deref (snd head))
	(cons (deref head)(print (deref (head))))