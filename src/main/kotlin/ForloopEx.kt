fun main(args: Array<String>) {
    //using forloop and range of number1..100
    //numbers divisible by 3 and 5 print fizzbuzz
    //numbers divisible by 3 only, print fizz
    //numbers divisible by 5 only ,print buzz

    for (x in 1..100) {
        if (x%3==0 && x%5==0) {
            println("$x is fizzbuzz")
        } else if (x%3==0){
                println("$x is fizz")
            }else if(x%5==0){
                    println("$x is buzz")
                }

            }
        }



