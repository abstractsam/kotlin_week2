package OOP

import javax.print.attribute.standard.PrinterMakeAndModel

class Car(make:String,model:String, price:Int ) {
    init {
        println("Make is $make")
        println("Model is $model")
        println("Price is $price")

    }

}
fun main(args: Array<String>) {

    var owner1 = Car(make ="Toyota", model = "Vitz", price = 450000)
    var owner2 = Car(make ="BMW", model = "312", price = 570000)



}

