fun main(args: Array<String>){
    println("Print Hello")

    for( i in 1..5){
        println("Hello $i")
    }

    println("Steps")
    for(i in 2..100 step 2){
        println("i = $i")
    }

    println("DownTo")
    for(i in 100 downTo 0 step 2){
        println("i = $i")
    }
}