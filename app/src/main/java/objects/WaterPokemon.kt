package objects

class WaterPokemon ( name:String, attack:Float, health:Float, velocity:Int):
    Pokemon( name, attack, health, velocity) {

        private var waterResistance:Int = 500
        private var submergedTime:Int = 0


    fun getWaterResistance():Int{
        return this.waterResistance
    }

    fun getSubmergedTime():Int{
        return this.submergedTime
    }

    fun setWaterResistance(waterResistance:Int){
        this.waterResistance = waterResistance
    }

    fun setSubmergedTime(submergedTime:Int){
        this.submergedTime = submergedTime
    }


    fun breath(){
        this.submergedTime = 0
    }

    fun inmersion(){
        this.submergedTime++
    }

}