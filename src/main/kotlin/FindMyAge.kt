import java.util.*

fun main(args:Array<String>){

    print("Please enter your year of birth: ")
    var yob:Int = readLine()!!.toInt()
    var currYear = Calendar.getInstance().get(Calendar.YEAR)

    var yourAge = currYear - yob

    println("You are $yourAge years old")
}