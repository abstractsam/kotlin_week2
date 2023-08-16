package OOPpolymorphism


//Superclass
open class Building(val type:String){
    open fun openDoor(){
        println("$type door is opening")
    }
}

//Subclass

class  House(type: String) : Building(type){
    override fun openDoor(){
        println("$type house door is opening")
    }

}

class Apartment(type: String) : Building(type){
    override fun openDoor(){
        println("$type apartment door is opening")
    }
}

class  Motel(type: String) : Building(type){
    override fun openDoor(){
        println("$type motel door is opening")
    }

}


fun main(args: Array<String>) {
    var building1: Building = House("The Bungalow") //House object is being treated like a buliding
    building1.openDoor() //Calls the overridden method in house

    var building2: Building = Apartment("Studio")
    building2.openDoor() //Calls the overridden method in apartment

    var building3: Building = Motel("Balcony")
    building3.openDoor() //Calls the overridden method in motel


}





