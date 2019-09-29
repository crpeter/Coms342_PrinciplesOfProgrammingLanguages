factorial(0,1).
factorial(N,F) :-
N > 0,
N1 is N-1,
factorial(N1,F1),
F is N * F1.

recMax([H|T],W,A,Max)  :-
H>A,
recMax(T,W,H,Max).

recMax([H|T],W,A,Max)  :-
H=<A,
recMax(T,W,A,Max).

recMax([],W,A,A) :-
factorial(A, W).

max(List,Max, W) :-
List = [H|_],
recMax(List,W,H,Max).

%usage max([0,1,6],Max,MaxFac).
