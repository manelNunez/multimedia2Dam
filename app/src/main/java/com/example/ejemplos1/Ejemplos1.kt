package com.example.ejemplos1

import kotlin.reflect.typeOf
var saldo:Float = 1000f
fun main(){

    var numero=32
    var numero2=1

    val resultado:Int=numero+numero2

    println("Hola mundo")
    println("El numero del nano es: $resultado")

    var numeroBucle:Int = 1

    //Bucle while
    bucle(numeroBucle)
    var fecha:String="12/09/2024"
    // Saber el mes
    mes(fecha)

restarSaldo(400f)
    restarSaldo(600f)
    if (comprobarSaldo()==true) println("Tienes saldo suficiente: $saldo")
    else println("Saldo insuficiente")
}

fun comprobarSaldo():Boolean{
    if(saldo>0) return true
    return false
}

fun restarSaldo(cantidad:Float){
    if(saldo<cantidad){
        println("No tienes suficiente saldo: $saldo")
    }else{
        saldo = saldo-cantidad
        println("Saldo actual: $saldo")
    }
}

fun mostrarSaldo(){
    println("Saldo: $saldo")
}

fun mes(fecha:String){

    var mes:Int=fecha.subSequence(3,5).toString().toInt()

    print("El mes de la fecha $fecha es: ")
    when(mes){
    1 -> println("Enero")
    2 -> println("Febrero")
    3 -> println("Marzo")
    4 -> println("Abril")
    5 -> println("Mayo")
    6 -> println("Junio")
    7 -> println("Julio")
    8 -> println("Agosto")
    9 -> println("Septiembre")
    10 -> println("Octubre")
    11 -> println("Noviembre")
    12 -> println("Diciembre")
        else -> println("Mes incorrecto")
    }

}

fun bucle(aux:Int){
    var aux1 = aux
    while (aux1<10){
        print("$aux1,")
        aux1++
    }
    println(aux1)
}