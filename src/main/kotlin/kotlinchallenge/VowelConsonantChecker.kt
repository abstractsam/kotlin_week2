package kotlinchallenge

fun main(args: Array<String>) {

    println("Enter any Character")
    var letter = readLine()!!.toString().trim()

    if(letter.isBlank()){
        println("Empty submission,try again")
    } else {

        var chara = letter[0].toLowerCase()

        var result = if (chara in "aeiou"){
            println("is a vowel")
        } else {
            println("Consonant")
        }


    }


    // if(letter =="a")
    //    print("$letter is a vowel")


     //else if(letter =="e")
       // print("$letter is a vowel")


    //else if(letter =="i")
       // print("$letter is a vowel")


    //else if(letter =="o")
       // print("$letter is a vowel")


    //else if(letter =="u")
        //print("$letter is a vowel")


    //else{
        //print("$letter is a consonant")
    }




