import java.util.*

fun main(args:Arrray<String>){
    var listOfUsers = HashMap<String, LinkedList<String>>()
    for(userID in 1..2){
        print("$userID: Enter Your Name: ")
        var userName = readLine()!!.toString()
        print("Enter Your Address: ")
        var address = readLine()!!.toString()
        var userPets = LinkedList<String>()
        println("Enter The name of the pet and Exit to end")
        do{
            var petName = readLine()!!.toString()
            if (petName != "exit"){
                userPets.add(petName)
            }
        } while (petName != "exit")

        listOfUsers["$userName, $address"] = userPets

//        println("==========USER INFO==========")
//        println("USer Name: $userName")
//        println("User Address: $address")
//        for (pet in userPets){
//            println("Pets: $pet")
//        }

        for(key in listOfUsers.key){
            println("==========USER INFO==========")
            println("USer Name & address: $userName, $address")
            for (pet in listOfUsers[key]){
                println("Pets: $pet")
            }
        }

    }
}