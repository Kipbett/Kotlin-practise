fun main(args:Array<String>){
    var num1 = 100
    var num2 = 200

    println("The numbers Before Swapping:\nNum1: $num1, \nNum2: $num2")

    var temp = num1
    num1 = num2
    num2 = temp

    println("The Numbers After Swapping:\nNum1: $num1, \nNum2: $num2")
}