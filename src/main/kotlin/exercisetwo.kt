fun main(args: Array<String>) {

    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    //10-29 E
    //30-39 D
    //40-49 C
    //50-59 B
    //60-100 A

    // if (marks in 10..29){
    //print("Scored E")
    //}

    if (marks<30){
        print("You have a grade E")
    }

    else if (marks<40){
        print("You have a grade D")
    }

    else if (marks<50){
        print("You have a grade C")
    }

    else if(marks<60){
        print("You have a grade B")
    }

    else if(marks<100){
        print("You have a grade A")
    }

    else {
        print("Invalid marks")
    }


}