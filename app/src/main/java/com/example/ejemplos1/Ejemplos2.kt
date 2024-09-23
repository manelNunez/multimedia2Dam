package com.example.ejemplos1

fun main(){

    val nombre = "Manel"

    println("Hola $nombre");


    // Sobrecarga de funciones
    println("Fun sum result: "+sumar( 2 , 3))

    println("Fun sum2 result: "+sumar( 2 , 3 , 5))

    // Null safety
    var nulo:String? = null

    println("Null safety: " + nulo?.length)

    // Barbaridad de if

    var valor:Int = if( nulo != null) nulo.length else 0

    // Operador Elvis
    var valor2:Int = nulo?.length ?: 0

    println("Valor null if control: $valor")

    println("Valor null elvis operator control: $valor2")

    // Casting with null type

    var x:Int? = null

    var l:Long = x?.toLong() ?: 0

    //Force it
    //var l1:Long = x!!.toLong()

    println("Casting int to long: $l")
}

fun sumar( x:Int , y:Int):Int{

    val resultado = x + y

    return resultado
}

fun sumar( x:Int , y:Int , z:Int):Int{

    val resultado = x + y + z

    return resultado
}