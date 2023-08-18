package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter any sentence")
    var words = readLine() ?: ""

    var wordsplit = words.split("")
    var wordreverse = wordsplit.reversed()

    println(wordreverse.joinToString (""))


    

    //var stringInput = readln().toString()
    //var result = stringInput.reversed()
    //println(result)

}

