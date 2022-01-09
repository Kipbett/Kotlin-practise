fun main(args: Array<String>){
    print("Enter the menu ID: ")
    var menuID:Int = readLine()!!.toInt()

    when (menuID){
        1 -> {
            println("You Picked Chips")
        }

        10 -> println("You picked Githeri")

        100 -> println("You Picked Rice")

        else -> println("You didnt select a menu")
    }
}