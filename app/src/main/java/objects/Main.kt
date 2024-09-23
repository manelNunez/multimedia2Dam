package objects

fun main(){

    var charmander:Pokemon = Pokemon("Charmander", 52f,
        39f, 65)

    var golem:Pokemon = Pokemon("Golem", 120f, 100f, 45)

    var flygon:Pokemon = Pokemon( "Flygon", 100f, 40f, 100)

    var pikachu:Pokemon = Pokemon("Pikachu")

    var charizard:Pokemon = Pokemon("Charizard", 120f)

    var greninja:WaterPokemon = WaterPokemon("Greninja", 95f, 89f, 122)

    var darmanitan:FirePokemon = FirePokemon("Darmanitan", 140f, 100f, 95)

    darmanitan.setFireBallTemperature(200)

    pikachu.setAttack(100f)

    println("Nombre: ${charmander.getName()}")
    println("Nombre: ${golem.getName()}")
    println("Nombre: ${flygon.getName()}")

    greninja.attackIt()

    darmanitan.attackIt()



}