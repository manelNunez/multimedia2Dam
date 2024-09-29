package com.actividades.actividades1.arrays

import java.util.Scanner

fun main(){



    println("Te voy a pedir 4 numeros para el primer conjunto")
    val array1 = crearArray()

    println("Te voy a pedir 4 numeros para el segundo conjunto")
    val array2 = crearArray()

    println("Array1: ${array1.asList().toString()}")
    println("Array2: ${array2.asList().toString()}")

    val array3 = sumarArrays(array1, array2)
    println("Array sumado: ${array3.asList().toString()}")

}

fun crearArray(): Array<Int> {
    val scan = Scanner(System.`in`)

    val array1 = Array<Int>(4) { 0 }
    var cont = 1
    while (cont <= 4){
        print("Numero $cont: ")
        if(scan.hasNextInt()){
            array1[cont-1] = scan.nextInt()
            cont++
        }else
            println("Error: No has introducido un Integer")
        scan.nextLine()

    }


    return array1

}

fun sumarArrays(array1:Array<Int>, array2: Array<Int>): Array<Int>{

    var cont = 0
    val array3 = Array<Int>(4) { 0 }
    for (number in array1){
        array3[cont] = number + array2[cont]
        cont++
    }
    return array3

}