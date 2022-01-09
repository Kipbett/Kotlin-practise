fun main(args: Array<String>){
    println("=====Use of continue=====")
    for( i in 1..10){
        if(i == 5)
            continue
        println(i)
    }

    println("=====Use of Break=====")
    for(i in 1..10){
        if(i == 6)
            break
        println(i)
    }
}