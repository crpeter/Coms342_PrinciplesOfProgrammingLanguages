isverb(El) :-
  El==writes;
  El==reviews.

isnoun(El) :-
  El==manager;
  El==programmer;
  El==code.
isnoun([El|_]) :-
  El==manager;
  El==programmer;
  El==code.

isarticle(El) :-
  El==a;
  El==the.

isnounphrase([H|T]) :-
  isarticle(H),
  isnoun(T).

isnounphrase(H,T) :-
  isarticle(H),
  isnoun(T).

isverbphrase([H|T]) :-
  isverb(H),
  isnounphrase(T).

issentence([H|[S|T]]) :-
  isnounphrase(H, S),
  isverbphrase(T).
