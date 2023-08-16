package kotlinchallenge

fun main(args: Array<String>) {
    println("What is your name")

    var name:String = readln()!!.toString()

    if(name.isBlank()){
        println("Please enter a valid name")
    }

    else {
        println("Hello $name!")
    }
}

