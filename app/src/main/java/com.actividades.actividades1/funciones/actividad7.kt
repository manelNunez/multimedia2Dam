package com.actividades.actividades1.funciones

import java.util.Scanner


fun main(){

    val scan = Scanner(System.`in`)

    println("Ingresa la clave: ")

    val key1:String = scan.nextLine()

    println("Ingresa otra vez la clave: ")

    val key2:String = scan.nextLine()

    println("Las dos cadenas son iguales: ${compareStrings(key1,key2)}")

}

fun compareStrings( string1:String, string2:String):Boolean{

    return string1.equals(string2)



}