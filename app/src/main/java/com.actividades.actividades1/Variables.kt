package com.actividades.actividades1

import android.icu.text.DecimalFormat
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.roundToLong

fun main(){

    //actividad1()
    //actividad2()
    //actividad3()
    //actividad4()


}



fun actividad1(){

    val squareSide:Int = 50

    val perimeterSquare:Int

    val surfaceSquare:Int

    perimeterSquare = squareSide * 4

    surfaceSquare = squareSide * 2

    println("El perimetro és: $perimeterSquare cm y la superficie és: $surfaceSquare cm")

}

fun actividad2(){

    val weightPerson1:Float = 45f
    val weightPerson2:Float = 73f
    val weightPerson3:Float = 96f

    val weightAverage:Float = ( weightPerson1 + weightPerson2 + weightPerson3 ) / 3


    println("Promedio de peso: $weightAverage")

    println("Promedio redondeado: ${String.format("%.2f",weightAverage)}")
}

fun actividad3() {

    val number1:Int = 4
    val number2:Int = 5
    val number3:Int = 3
    val number4:Int = 8

    println("La suma del primero y el segundo: ${number1 + number2} y el producto del tercero y cuarto: ${number3 % number4}")

}

fun actividad4(){

    val costArticle:Float = 100f

    val clientMoney:Float = 46f

    println("El comprador debe abonar: ${ costArticle - clientMoney} €")

}
