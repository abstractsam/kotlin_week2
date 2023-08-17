package OOP.abstraction



abstract class Plants(val name:String) {

    //abstract method
    abstract fun grow()

    //general method
    fun describe (){
        println("$name is a plant")
    }

}

//subclass of a plant
class Tree(name:String) : Plants(name){
    override fun grow() {
        println("$name grows very tall")
    }

}

//another subclass
class Flower(name:String) : Plants(name){
    override fun grow() {
        println("$name grows very short")
    }

}

fun main(args: Array<String>) {

    val plant1 : Plants = Tree("Lily")
    val plant2 : Plants = Flower("Violet")

    plant1.describe()
    plant1.grow()

    plant2.describe()
    plant2.grow()

}


