fun main(args: Array<String>) {

    printSum(num1 = 120, num2 = 400)
}

fun printSum(num1:Int, num2:Int){
    var sum = sumNumbers(num1, num2)
    print(sum)
}

fun sumNumbers(num1:Int, num2:Int):Int{
    return num1 + num2

     }
