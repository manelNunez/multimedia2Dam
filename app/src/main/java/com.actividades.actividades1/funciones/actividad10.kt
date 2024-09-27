package com.actividades.actividades1.funciones


fun main(){

    val numbersSum = sumNumbers(1,2,3,4,5)

    println("La suma de los numeros es: $numbersSum ")

}

fun sumNumbers( vararg nums:Int):Int{

  var result:Int = 0

  for (num in nums){
      result += num
  }

    return result
}