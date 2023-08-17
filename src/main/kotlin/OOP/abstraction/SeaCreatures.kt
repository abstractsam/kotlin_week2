package OOP.abstraction

abstract class SeaCreatures(val name:String) {

    //abstract method
    abstract fun makeSound()

    //general method
    fun describe (){
        println("$name is a sea creature")
    }

}

//subclass of a sea creature
class Fish(name:String) : SeaCreatures(name){
    override fun makeSound() {
         println("$name makes a blup blup sound")
    }

}

//another subclass
class Whale(name:String) : SeaCreatures(name){
    override fun makeSound() {
        println("$name makes a deep underwater noise")
    }
}

fun main(args: Array<String>) {

    val creature1 : SeaCreatures = Fish("Nemo")
    val creature2 : SeaCreatures = Whale("Octavia")

    creature1.describe()
    creature1.makeSound()

    creature2.describe()
    creature2.makeSound()

}

