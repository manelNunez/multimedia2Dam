package objects

import android.health.connect.datatypes.units.Velocity

class FirePokemon (name:String, attack:Float, health:Float, velocity:Int):Pokemon( name, attack, health, velocity){

    private var fireBallTemperature:Int = 0

    fun getFireBallTemperature():Int{
        return this.fireBallTemperature
    }

    fun setFireBallTemperature(fireBallTemperature:Int){
        this.fireBallTemperature = fireBallTemperature
    }

    override fun attackIt() {
        println("FlameThrowing")
    }

}