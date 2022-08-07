En el main se ejecutaron la siguientes funciones:

	llenar()
	fmt.Println(Secuencia original, numeros)

	fmt.Println(Movimiento a la Izquierda , mover(&numeros, 2, Izq))
	fmt.Println(Movimiento a la Derecha , mover(&numeros, 2, Der))

Lo cual dio el siguiente resultado:

Secuencia original [1 2 3 4 5]
Movimiento a la Izquierda:  [3 4 5 1 2]
Movimiento a la Derecha:  [4 5 1 2 3]