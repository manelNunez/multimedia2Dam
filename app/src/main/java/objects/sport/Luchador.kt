package objects.sport

class Luchador( nombre:String, edad:Int,
                altura:Float, nacionalidad:String,
                var estilo:String, var victorias:Int,
                var derrotas:Int): Deportista( nombre, edad, altura, nacionalidad ) {


}