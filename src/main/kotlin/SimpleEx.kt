import java.util.*

fun main(args: Array<String>) {

    //Write a simple kotlin programme
    // Enter year born
    // Displays your age

    //println("Enter Year Born")
    //var year1:Int = readLine()!!.toInt()
    //println("Enter Current Year")
    //var year2:Int = readLine()!!.toInt()

    //var result= year2 - year1
    //print(result)


    //println("Enter Year Born")

    //var year = readLine()!!.toInt()
    //var age = (2023 -  year)

    //println(age)

    print("Enter year born")
    var birthyear = readLine()!!.toInt()


    var currentyear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentyear - birthyear
    println("You are $age years old")

}