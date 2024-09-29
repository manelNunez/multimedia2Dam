package com.actividades.actividades1.arrays

fun main(){


    var numbers = arrayOf(1,5,32,332,2,34,67,2,1,10)

    var aux = numbers.copyOf()

    if( numbers.toString().equals(aux.sort().toString())){
        println("Si que esta ordenado: ")
        println("\t Array: ${numbers.toString()}")
    }

    else{
        println("No esta ordenado:")
        println("\t Array original: ${numbers.asList().toString()}")
        println("\t Array ordenado: ${numbers.sorted().toString()}")
    }


    println()


}