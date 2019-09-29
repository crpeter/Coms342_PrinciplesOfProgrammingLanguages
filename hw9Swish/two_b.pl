nextto(H, T, [H,T|_]).

nextto(X, Y, [_|Rs]) :-
  nextto(X, Y, Rs).
