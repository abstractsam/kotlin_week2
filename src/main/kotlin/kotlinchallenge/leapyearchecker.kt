package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter the year")
    var year:Int = readln()!!.toInt()

    if (year % 4 == 0){
        println("$year is a leap year")
    } else{
        println("$year is not a leap year")
    }

}
