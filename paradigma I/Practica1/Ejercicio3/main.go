package main

import "fmt"

//array inicial
var numeros [5]int

//funcion para asignar datos quemados
func llenar() {
	numeros[0] = 1
	numeros[1] = 2
	numeros[2] = 3
	numeros[3] = 4
	numeros[4] = 5
}

//mueve un espacio a la izquierda
func moverIzq(lista *[5]int) []int {

	movIzq := lista[1:]
	movIzq = append(movIzq, lista[0])
	return movIzq
}

//mueve un espacio a la derecha
func moverDer(lista *[5]int) []int {
	movDer := lista[len(lista)-1:]

	for i := 0; i < len(lista)-1; i++ {
		movDer = append(movDer, lista[i])

	}

	return movDer
}

//funcion que recibe la cantidad de movimietos, la direccion y el arreglo a mover
func mover(lista *[5]int, Cant int, Dir string) []int {

	var respuesta []int
	var temp [5]int

	for elemento := range *lista {
		cont := lista[elemento]

		temp[elemento] = cont
	}

	if Cant == 0 {
		return temp[:]
	}

	if Dir == "Izq" {
		for i := 0; i < Cant; i++ {

			respuesta = moverIzq(lista)
			lista = (*[5]int)(respuesta)

		}
	} else {
		for i := 0; i < Cant; i++ {
			respuesta = moverDer(lista)
			lista = (*[5]int)(respuesta)

		}

	}

	return respuesta[:]
}

func main() {
	llenar()
	fmt.Println("Secuencia original", numeros)

	fmt.Println("Movimiento a la Izquierda: ", mover(&numeros, 2, "Izq"))
	fmt.Println("Movimiento a la Derecha: ", mover(&numeros, 2, "Der"))
}
