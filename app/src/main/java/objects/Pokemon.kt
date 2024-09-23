package objects

open class Pokemon(  private var name:String,  private var attack:Float,
                private var health:Float = 100f,  private var velocity:Int) {


    // Secundary constructor

    constructor( name:String ):this( name, 0f, 0f, 0)
    constructor( name:String, attack: Float ):this( name, attack, 0f, 0)


    // Getters
    fun getName():String { return this.name }

    fun getAttack():Float { return this.attack }

    fun getHealth():Float { return this.health}

    fun getVelocity():Int { return this.velocity}

    // Setters

    fun setName( name:String ){
        this.name = name
    }

    fun setAttack( attack: Float ){
        this.attack = attack
    }

    fun setHealth( health: Float ){
        this.health = health
    }

    fun setVelocity( velocity: Int ){
        this.velocity = velocity
    }

}