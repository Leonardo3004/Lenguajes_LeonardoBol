package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {

	var bandera = 0

	for i := 0; i < len(*l); i++ {
		if nombre == (*l)[i].nombre {
			(*l)[i].cantidad = (*l)[i].cantidad + cantidad
			(*l)[i].precio = (*l)[i].precio + precio
			fmt.Println("El producto", (*l)[i].nombre, "a sido sumado a la existente ahora su cantidad es", (*l)[i].cantidad, "y su precio", (*l)[i].precio)
			bandera = 1
		}

	}

	if bandera == 0 {
		lProductos = append(lProductos, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	}

	// modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
	// de elementos del producto y eventualmente el precio si es que es diferente
}

func (l *listaProductos) buscarProducto(nombre string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}
	return result
}

func elimina(slice []producto, s int) []producto {
	return append(slice[:s], slice[s+1:]...)
}

func (l *listaProductos) venderProducto(nombre string, cant int) {
	var prod = l.buscarProducto(nombre)
	if prod != -1 && cant > 0 {
		if (*l)[prod].cantidad >= cant {
			(*l)[prod].cantidad = (*l)[prod].cantidad - cant
		} else {
			fmt.Println("No se puede vayor cantidad de productos que los que hay en existencia")
		}

		//modificar para que cuando no haya existencia de cantidad de productos, el producto se elimine de "la lista"
	}
	if (*l)[prod].cantidad <= 0 {
		fmt.Println("El producto", (*l)[prod].nombre, " se elimino")
		(*l) = elimina(*l, prod)

	}
}
func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 0, 1200)
	lProductos.agregarProducto("café", 12, 4500)

}

func (l *listaProductos) listarProductosMínimos() listaProductos {
	var listaExistenciaMinima listaProductos

	for i := 0; i < len(*l); i++ {
		if (*l)[i].cantidad <= existenciaMinima {
			listaExistenciaMinima = append(listaExistenciaMinima, (*l)[i])
			fmt.Println("El producto", (*l)[i].nombre, "se agrego a la lista de existencia minima")
		}

	}
	fmt.Println("se creo la lista de productos con existencia minima")

	// debe retornar una nueva lista con productos con existencia mínima
	return listaExistenciaMinima
}

func (l *listaProductos) aumentarInventarioDeMinimos() {

	for i := 0; i < len(*l); i++ {
		if (*l)[i].cantidad <= existenciaMinima {
			(*l)[i].cantidad = existenciaMinima
			fmt.Println("Se Aumento el inventario de ", (*l)[i].nombre, "al minimo establecido", existenciaMinima)
		}

	}

	return
}

func (l *listaProductos) ordenarAcendenteCantida() {
	sort.Slice(*l, func(p, q int) bool {
		return (*l)[p].cantidad < (*l)[q].cantidad
	})

	fmt.Println("La lista a sido ordenada por cantidad")

}

func main() {
	llenarDatos()
	fmt.Println(lProductos)
	lProductos.venderProducto("arroz", 6)
	fmt.Println(lProductos)
	lProductos.agregarProducto("azucar", 20, 1500)
	fmt.Println(lProductos)
	lProductos.venderProducto("frijoles", 4)
	fmt.Println(lProductos)
	lProductos.venderProducto("leche", 10)

	lProductos.agregarProducto("café", 12, 4500)
	fmt.Println("-----------------------")
	fmt.Println(lProductos)
	fmt.Println("-----------------------")
	fmt.Println(lProductos.listarProductosMínimos())
	fmt.Println("-----------------------")
	fmt.Println("Practica 2 ejercicio 1.a")
	//se invoca el ejercico 1.a

	lProductos.aumentarInventarioDeMinimos()
	fmt.Println(lProductos)
	fmt.Println("-----------------------")
	fmt.Println("Practica 2 ejercicio 1.b")
	//Se invoca el ejercicio 1.b

	lProductos.ordenarAcendenteCantida()
	fmt.Println(lProductos)
	fmt.Println("-----------------------")
}

// si ha sobrado tiempo antes del receso, el ejercicio se podría ampliar para que los los productos se almacenen en archivos de texto
// que al inicio se carguen del archivo a la lista y que al final se actualice el archivo con el contenido de la lista
