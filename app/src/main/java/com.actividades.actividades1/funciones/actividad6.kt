package com.actividades.actividades1.funciones


fun main(){


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