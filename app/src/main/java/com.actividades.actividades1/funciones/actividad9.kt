package com.actividades.actividades1.funciones


fun main(){

    val averageNumber = averageNumbers( 10f, 10f, 10f)

    println("La media es: ${String.format("%.2f",averageNumber)}")

}

fun averageNumbers( x:Float, y:Float, z:Float):Float{

    val array = arrayOf( x, y, z)

    var result:Float = 0f

    for (number in array) result += number

    return result / array.size


}