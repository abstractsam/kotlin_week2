package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter Any Number")
    var num: Int = readln().toInt()

        if (num == null){
            println("Please enter a valid number")
        } else{
            var result = if(num % 2 == 0){
                println("$num is even")
            } else {
                println("$num is odd")
            }
        }


        //if (num%2==0) {
          //  println("$num is an even number")
        //} else {
          //  println("$num is an odd number")
        //}


}