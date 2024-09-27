package com.actividades.actividades1.variables

fun main(){

    val weightPerson1:Float = 45f
    val weightPerson2:Float = 73f
    val weightPerson3:Float = 96f

    val weightAverage:Float = ( weightPerson1 + weightPerson2 + weightPerson3 ) / 3


    println("Promedio de peso: $weightAverage")

    println("Promedio redondeado: ${String.format("%.2f",weightAverage)}")
}