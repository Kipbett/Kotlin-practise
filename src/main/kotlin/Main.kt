fun main(args: Array<String>) {
    var department:String? = null

    println(department)

    print("Enter Your Name: ")
    var name:String = readLine()!!.toString()
    print("Enter Your Age: ")
    var age:Int = readLine()!!.toInt()

    println("Name: $name")
    println("Age: $age")

}