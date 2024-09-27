package com.actividades.actividades1.poo

fun main(){


    var l1:Libro = Libro("Don Quijote de la Mancha","Miguel de Cervantes Saavedra", 1605,50.00)

    var d1:LibroDigital = LibroDigital("Antes de Diciembre", "Joana Marcús", 2021, 50.00, "epub" )


    println( l1.toString())
    println(d1.toString())


    println("\nAplicando descuentos\n")

    l1.calcularPrecioDescuento()
    d1.calcularPrecioDescuento()

    println( l1.toString())
    println(d1.toString())
}