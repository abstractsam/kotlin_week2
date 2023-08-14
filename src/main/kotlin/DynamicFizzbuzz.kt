fun main(args: Array<String>) {

    //for the ranges 1..100
    //User type to enter first and second number

    println("Enter First Number")
    var num1:Int = readln().toInt()

    println("Enter Second Number")
    var num2:Int = readln().toInt()


    for (x in num1..num2) {
        if (x%3==0 && x%5==0) {
            println("$x is fizzbuzz")
        } else if (x%3==0){
            println("$x is fizz")
        }else if(x%5==0){
            println("$x is buzz")
        }

    }
}



