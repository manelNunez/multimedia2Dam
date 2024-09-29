package com.actividades.actividades1.arrays

import java.util.Scanner

fun main(){



    println("Voy a crear un array de n elementos")

    val n = valorN()

    val array1 = crearArray(n)

    val result = sumarArray(array1)

    println("Resultado de la suma de los valores del array: $result")

}

fun valorN ():Int{

    val scan = Scanner(System.`in`)

   while (true){
       print("Indica ese valor para n: ")
       if(scan.hasNextInt()) return scan.nextInt()
       else{
           println("Error: No has introducido un Integer")
           scan.nextLine()
       }
   }
}

fun crearArray( n:Int ): Array<Int> {
    val scan = Scanner(System.`in`)

    val array1 = Array<Int>(n) { 0 }
    var cont = 1
    while (cont <= n){
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

fun sumarArray ( array:Array<Int> ):Int{

    var result:Int = 0

    for (number in array)
        result += number

    return result
}