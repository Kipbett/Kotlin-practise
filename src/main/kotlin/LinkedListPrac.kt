import java.util.*

fun main(args:Array<String>){
    var listOfPets = LinkedList<String>()

    do{
        print("Enter The name of the pet")
        var petName = readLine()!!.toString()
        if(petName != "quit"){
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    println("The pets ordered are: ")
    for(pet in listOfPets){
        println(pet)
    }
}