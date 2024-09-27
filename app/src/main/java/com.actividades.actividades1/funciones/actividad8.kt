package com.actividades.actividades1.funciones

import java.util.Scanner


fun main(){

    val scan = Scanner(System.`in`)

    println("Introduce primer numero: ")

    val number1 = scan.nextInt()

    println("Introduce segundo numero: ")

    val number2 = scan.nextInt()

    println("Introduce tercer numero: ")

    val number3 = scan.nextInt()

    orderNumbers( number1, number2, number3)

}

fun orderNumbers( x:Int, y:Int, z:Int){

    val numbers = arrayOf( x, y, z)

    println("Numeros ordenados: ${numbers.sorted()}")

}