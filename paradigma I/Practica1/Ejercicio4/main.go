package main

import "fmt"

//esrtructura solicitada
type calzado struct {
	modelo string
	precio int
	talla  int
}

//slice para almacenar
var lista_zapatos []calzado

//funcion que crea un zapato y lo retorna
func creaCalzado(model string, prec int, tall int) calzado {

	c := calzado{modelo: model, precio: prec, talla: tall}
	return c
}

//funcion para meter datos quemados
func llenar1() {
	lista_zapatos = append(lista_zapatos, creaCalzado("AirJordan", 40000, 34))
	lista_zapatos = append(lista_zapatos, creaCalzado("Nike", 44000, 35))
	lista_zapatos = append(lista_zapatos, creaCalzado("GalloTenis", 50000, 36))
	lista_zapatos = append(lista_zapatos, creaCalzado("DripTenis", 48000, 37))
	lista_zapatos = append(lista_zapatos, creaCalzado("Adidas", 53000, 38))
	lista_zapatos = append(lista_zapatos, creaCalzado("Adidas", 53000, 38))
	lista_zapatos = append(lista_zapatos, creaCalzado("Tacones", 21000, 39))
	lista_zapatos = append(lista_zapatos, creaCalzado("Zapatillas", 70000, 40))
	lista_zapatos = append(lista_zapatos, creaCalzado("Tacos", 39000, 41))
	lista_zapatos = append(lista_zapatos, creaCalzado("BotasCuero", 12000, 42))
	lista_zapatos = append(lista_zapatos, creaCalzado("Chancletas", 30000, 43))
	lista_zapatos = append(lista_zapatos, creaCalzado("Crock", 400000, 44))
}

//funcion que valida los datos y agrega los zapatos al Slice
func agregarZapato(model string, prec int, tall int) {
	if tall > 44 || tall < 34 {
		fmt.Println("La talla del calzado no cumple los parametros")
		return
	}

	creaCalzado(model, prec, tall)
	fmt.Println("Calzado Agregado")
}

//funcion que muestra los datos del slice
func mostrar_info() {
	for i := 0; i < len(lista_zapatos); i++ {
		fmt.Println(i+1, ". modelo : ", lista_zapatos[i].modelo, " talla : ", lista_zapatos[i].talla, " precio : ", lista_zapatos[i].precio)
	}
}

//funcion que elimina un elemnto del slice
func elimina(slice []calzado, s int) []calzado {
	return append(slice[:s], slice[s+1:]...)
}

//funcion que valida las ventas
func vender(model string, prec int, tall int) {

	for i := 0; i < len(lista_zapatos); i++ {
		if lista_zapatos[i].modelo == model && lista_zapatos[i].precio == prec && lista_zapatos[i].talla == tall {
			lista_zapatos = elimina(lista_zapatos, i)
			fmt.Println("---------zapato vendido----------")
			mostrar_info()
			return
		}
	}
	fmt.Println("---------Ese Zapato no esta en Stock----------")

}

func main() {
	llenar1()                          //se cargan los datos quemados
	agregarZapato("Crock", 400000, 44) //se agrega un nuevo zapato
	mostrar_info()                     //se muestra el stock
	vender("Crock", 400000, 44)        //se vende un zapato

	vender("Crock", 400000, 44) //se vende un zapato cuyo stock fue agotado
}
