package OOP

open class Animal(color:String, legs:String, breed:String, gender:String) {
    init {

        println("color is $color and it has $legs of $breed and its a $gender ")
    }

}

class Dog(name:String) : Animal(color = "white", legs = "4legs", breed = "Pit-bull", gender = "male")

{
    fun nameofdog(){
        println("Bosco")
    }
}

fun main(args: Array<String>) {
    var dog1 = Dog("Bosco")
    dog1.nameofdog()
}


