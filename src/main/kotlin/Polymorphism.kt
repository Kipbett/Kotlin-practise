fun showInfo(userID:Int):Int{
    return userID
}

fun showInfo(userName: String):String{
    return userName
}

fun main(args:Array<String>){
    println("User ID: ${showInfo(123)}")
    println("User Name: ${showInfo("KIP")}")
}