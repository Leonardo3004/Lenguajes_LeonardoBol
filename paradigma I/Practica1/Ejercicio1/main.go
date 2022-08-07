package main

import "fmt"

var caracter uint8 = 0
var palabras uint8 = 0
var lineas uint8 = 0

const texto = "Ellos solían escuchar voces.\nAntes de que los jugadores pudiesen leer.\nEn aquellos días cuando los que no podían jugar llamaban brujos a los jugadores.\nY los jugadores soñaron que volaban por los aires, sobre palos alimentados por demonios."

func contar() {
	if texto == "" {
		fmt.Println("El texto esta vacio")
		return
	}

	palabras++
	lineas++

	for i, letra := range texto {

		if letra == 32 {
			palabras++
		}
		if letra == 10 {
			palabras++
			lineas++
		}
		if i == 256 {
			fmt.Println("El texto exedio el largo permitido")
			return
		}
		caracter++
	}

	fmt.Println("El texto contiene", lineas, "lineas", palabras, "palabras y", caracter, "caracteres")

}

func main() {
	fmt.Println("----------------------------------------------------")
	fmt.Println(texto)
	fmt.Println("----------------------------------------------------")
	contar()
}
