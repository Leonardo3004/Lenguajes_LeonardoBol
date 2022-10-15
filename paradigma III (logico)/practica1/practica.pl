isSubString(Value,String) :-
           sub_string(String, Before, Length, After, Value),!.


subCadenas(Val, In, Out) :-
    include(isSubString(Val), In, Out).


subConjunto([],[]):- true,!.
subConjunto([A|B],[]):- false,!.
subConjunto([],[A|B]):- true,!.
subConjunto([A|B],[C|D]):- A=C,subConjunto(B,D).

subConjunto([A|B],L):- pertenece(A,L),
		subConjunto(B,L),!.

subConjunto([A|_],L):- not(pertenece(A,L)),false.

pertenece([],[]).
pertenece(A,[A|_]).
pertenece(A,[_|B]):- pertenece(A,B).


aplanar([],[]).
aplanar([[A|B]|C],D):-aplanar([A|B],T),
           aplanar(C,R),
           append(T,R,D),!.
aplanar([[]|A],B):-aplanar(A,B),!.
aplanar([A|B],[A|C]):-aplanar(B,C).



