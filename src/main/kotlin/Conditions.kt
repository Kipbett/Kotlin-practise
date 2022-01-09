fun main(args:Array<String>){

    println("Enter the grade you got")
    var grade: Int = readLine()!!.toInt()

    if(grade <= 0 || grade > 100){
        println("You Entered an Invalid grade.\nGrade cannot be 0 or a negative")
    } else if(grade in 1..10){
        println("The grade is too low.\nYou'll have to repeat")
    } else if(grade in 11..30){
        println("The grade is fair.\nCan get somewhere")
    } else if(grade in 31..60){
        println("You passed")
    } else {
        println("This is exemplary")
    }
}