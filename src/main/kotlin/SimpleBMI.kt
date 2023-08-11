fun main(args: Array<String>) {

    println("Enter weight in kg")
    var num1:Float = readLine()!!.toFloat()
    println("Enter height in meters")
    var num2:Float = readLine()!!.toFloat()


    var result = num1 / (num2*num2)
    print(result)

}