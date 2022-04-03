fun main(){
odd()
    robots(4)
    robots(7)
    robots(18)
    robots(30)
    numb()
   println(them(arrayOf("caro","shiana","kyarikunda","lonely")))
}
// Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun odd () {
    for (d in 1..100)
        if (d % 2 != 0) {
            println(d)
        }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun them(names:Array<String>):Int{
    var w=0
    names.forEach { p ->
    if (p.length >5)
        w++
    }
    return w
}
fun robots(age:Int){
    if (age<6){
        println(" A glass of milk")
    }
    else if (age>=6 && age<15){
        println("A bottle of fanta orange")

}
    else{
            println("A bottle of coca cola")
    }
}
fun numb() {
    for (x in 1..100)
        if (x % 3 == 0 && x % 5 == 0) {
            println("Fizz Buzz")
        } else if (x % 3 == 0) {
            println("Fizz")
        } else {
            if (x % 5 == 0) {
                println("Buzz")
            }
        }
}


