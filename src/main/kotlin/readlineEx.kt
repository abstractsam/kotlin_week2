fun main(args: Array<String>) {
    println("Enter your age")

    var myage: Int = readLine()!!.toInt()

    if (myage >= 18) {
        print("Welcome to the club")

    } else {
        print("Sorry cannot admit an underage")
    }


}