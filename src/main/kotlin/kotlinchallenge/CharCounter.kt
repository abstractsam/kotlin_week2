package kotlinchallenge

fun  CharCountOccurence(userinput:String, chartag:Char) :Int{

    var charCount = 0
    for (x in userinput) {
        if (x == chartag) {
            charCount += 1
        }
    }

    return charCount


}


    fun main(args: Array<String>) {
        println("Enter Any Word or Sentence")
        var datastringInput = readLine()!!.toString() //or readLine() ?: ""  -> for if statements
        println("Enter any Letter to check for occurrences")
        var mytargetChar = readLine()!!.getOrNull(0) //or readLine() ?.get(0) ?: ' '


        if (datastringInput != null && mytargetChar != null) {
            var charOccurence = CharCountOccurence(datastringInput, mytargetChar)
            println("$mytargetChar appears $charOccurence number of times")

        } else {
            println("Inavalid input")
        }

    }


//var CharCountOccurence = "google"
    //var mytargetChar = 'o'
    //var charOccurence = CharCountOccurence(CharCountOccurence, mytargetChar)
    //println("$mytargetChar appears $charOccurence number of times")


