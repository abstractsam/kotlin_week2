fun main(args: Array<String>) {



    println("*544#")

    var option = readLine()!!.toInt()
    when(option) {

        1 -> print("Data Deals")
        2 -> print("Daily Bundles")
        3 -> print("Monthly Bundles")
        4 -> print("No Expiry Bundles")
        5 -> print("Okoa Data")
        6 -> print("Lipa Mdogo")
        7 -> print("Data Plus")
        8 -> print("Hot Minutes")

        else -> print("Invalid option")
    }

}