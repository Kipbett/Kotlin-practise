fun main(args:Array<String>){
    var listOfPets:Array<String> = Array(3){""}
//    listOfPets[0] = readLine()!!.toString()
//    listOfPets[1] = readLine()!!.toString()
//    listOfPets[2] = readLine()!!.toString()

    for( i in 0..2){
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0..2){
        println(listOfPets[i])
    }
}