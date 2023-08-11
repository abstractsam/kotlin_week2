fun main(args: Array<String>) {


    println("Enter number to indicate floor")

    var floor = readLine()!!.toInt()
    when(floor){

        1-> print("Go to First floor")
        2-> print("Go to Second floor")
        3-> print("Go to Third floor")
        4-> print("Go to Fourth floor")

        else ->print("No floor above fourth floor")

    }
}