fun main(args: Array<String>){
    println("The details of the client")

    for(client in 1..3){
        println("Enter name for client $client: ")
        var name:String = readLine()!!.toString()
        println("Enter the address for client $client: ")
        var address:String = readLine()!!.toString()
        println("Enter the number of pets client $client has: ")
        var petCount:Int = readLine()!!.toInt()
        var petname:String? = ""
        for(pet in 1..petCount){
            println("Enter the petname for client $client: ")
            petname += readLine()!!.toString() + " "
        }

        println("==========Client Info==========")
        println("Client Name: $name")
        println("Client Address: $address")
        println("The client's pets: $petname")
        if(petname!!.contains("cat")){
            println("Your cat needs to tamed")
        }
    }
}