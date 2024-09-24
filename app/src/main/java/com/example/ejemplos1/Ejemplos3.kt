package com.example.ejemplos1

import kotlin.math.abs

fun main(){

    /*mostrarNombres("Pepe","Maria","Vicent")
    recorrerDias()
    listarMutables()*/

    var x:Int = -3

    println(x.valorAbsoluto(true))

    println(x.resta(2))

    println( x resta 10)

    println( 8 op 2)


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

//Funciones infix

infix fun Int.valorAbsoluto(valor:Boolean) =
    if(valor) abs( this ) else this

infix fun Int.resta(num:Int) =
    this-num

infix fun Int.op (num:Int) =
    if (num == 1){
        this + 2
    }else if (num == 2){
        this - 2
    }else if(num == 3){
        this * 2
    }else if(num == 4){
        this / 2
    }else{
        this
    }




