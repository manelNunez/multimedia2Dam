package com.actividades.actividades1.poo

open class Libro (var titulo:String, var autor:String,
             var fechaPublicacion:Int, var precio:Double) {



    open fun calcularPrecioDescuento(){

        precio -= precio * 0.10

    }

    override fun toString(): String {
        return "Libro: Titulo: '$titulo', " +
                "Autor: '$autor', Fecha de Publicacion: $fechaPublicacion, " +
                "Precio: $precio)"
    }
}