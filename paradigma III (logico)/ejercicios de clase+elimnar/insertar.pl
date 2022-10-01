patron(oscar, universidad).
patron(smith, universidad).
patron(pratt, universidad).
editor(oscar,prenticehall).
editor(pratt,prenticehall).

empleado(X):-patron(X,_).
empleadopor(X):-patron(X,Y),write(Y).


miembro(N,[N|_]).
miembro(N,[_|Tail]) :- miembro(N,Tail).

factorial(0,1).
factorial(A,B) :-
		A > 0,
		C is A-1,
		factorial(C,D),
		B is A*D.

insertar(E,[],[E]).
insertar(E,[H|T],[E|[H|T]]):-  E < H,!.
insertar(E,[H|T],[H|R]):- insertar(E,T,R).


eliminar(_, [], []).
eliminar(Y, [Y|Xs], Zs):-
          eliminar(Y, Xs, Zs), !.
eliminar(X, [Y|Xs], [Y|Zs]):-
          eliminar(X, Xs, Zs).
