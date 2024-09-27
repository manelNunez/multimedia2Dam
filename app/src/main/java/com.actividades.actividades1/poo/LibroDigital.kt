package com.actividades.actividades1.poo

class LibroDigital ( titulo:String, autor:String,
                     fechaPublicacion:Int, precio:Double,
                     var formato:String):Libro
                        ( titulo, autor, fechaPublicacion, precio) {


    override fun calcularPrecioDescuento(){

        precio -= precio * 0.20

    }

    override fun toString(): String {
        return "Libro: Titulo: '$titulo', " +
                "Autor: '$autor', Fecha de Publicacion: $fechaPublicacion, " +
                "Precio: $precio, Formato: '$formato')"
    }


}