

package OOP

class House(landlord:String, location:String, price:Int ) {
    init {
        println("The landlord of the house is $landlord,the location of the house is $location, the price for this property stands at $price")

    }
}

fun main(args: Array<String>) {
    var owner_1 = House( "Maina", "Ruiru", 250000 )
    var owner_2 = House( "Kevin", "Rostas", 320000)
    var owner_3 = House("Cyrus", "Upperhill", 299999 )
    var owner_4 = House( "Daniel", "Windsor", 350000 )




}









