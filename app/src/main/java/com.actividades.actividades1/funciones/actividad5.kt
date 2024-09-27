package com.actividades.actividades1.funciones

import kotlin.math.pow

fun main(){

    val numberInsertInteger:Float = 2f

    val productNumber1:Float = 313.3f
    val productNumber2:Float = 53.34f

    insertInteger(numberInsertInteger)

    productNumbers(productNumber1,productNumber2)

}

fun insertInteger(x: Float){

    println("Cuadrado del numero: ${x.pow(2)}")

}

fun productNumbers( x: Float, y: Float){

    println("Producto de $x y $y és: ${ x % y }")

}
