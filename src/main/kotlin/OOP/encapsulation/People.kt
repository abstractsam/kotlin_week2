package OOP.encapsulation

import javax.naming.Name

//offering protection of data to an outside world
class People(private val name:String, private val age:Int) {

    fun getPersoninfo() : String{
       return "Name: $name, Age: $age"
    }
}


fun main(args: Array<String>) {

    val person1 = People("Bazu", 25)
    println(person1.getPersoninfo())

}