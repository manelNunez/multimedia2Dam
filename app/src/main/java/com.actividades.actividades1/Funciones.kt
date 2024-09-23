package com.actividades.actividades1

import java.util.Scanner
import kotlin.math.pow

fun main(){

    //actividad5()
    //actividad6()
    actividad7()


}

fun actividad5(){

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

fun actividad6(){


    val number1 = 2
    val number2 = 6
    val number3 = 1

    for( i in 1..2){
        showMinusNumber(number1,number2,number3)
    }


}

fun showMinusNumber( x:Int, y:Int, z:Int){

    println("El numero menor és: ${minOf(x,y,z)}")

}

fun actividad7(){

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