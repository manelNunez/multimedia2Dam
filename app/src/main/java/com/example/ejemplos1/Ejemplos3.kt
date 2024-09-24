package com.example.ejemplos1

fun main(){

    mostrarNombres("Pepe","Maria","Vicent")
    recorrerDias()
    listarMutables()
}

fun mostrarNombres(vararg nombres:String){

    println(nombres[0])
    println(nombres[1])
    println(nombres[2])

}

fun recorrerDias(){

    var diasSemanas = arrayOf("Lunes", "Martes")

    for ( dia in diasSemanas ) println ( dia )

    for ( ( pos, valor ) in diasSemanas.withIndex() ){
        println( "La posicion $pos tiene el valor $valor" )
    }

}

fun listarMutables (){

    var listasMutables:MutableList<String> =
        mutableListOf("Lunes", "Martes")

    listasMutables.add("Miercoles")

    listasMutables.add(0, "Dias: ")

    for (dia:String in listasMutables) print("$dia ")

}