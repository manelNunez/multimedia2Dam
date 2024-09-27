package com.actividades.actividades1.funciones


fun main(){

    val aboveAgeResult:Int = aboveAge(1,2,20,3,18,4,5)

    println("La cantidad de mayores de edad es: $aboveAgeResult ")

}

fun aboveAge( vararg nums:Int): Int {

    var listaNumeros:MutableList<Int> = mutableListOf(0)

  for (num in nums)
      if( num >= 18 )
          listaNumeros.add(num)

    return listaNumeros.size - 1
}
