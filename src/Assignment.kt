import javax.print.DocFlavor

fun main() {
    odd( )
    names("Nyatichi")
    names("Irene")
    robot(5)
    robot(9)
    robot(17)
    number()
}

fun odd() {
    for (number in 1..100) {
        if (number % 2 !== 0) {
            println(number)
        }
    }
}

fun names(names:String) {
    if (names.length>5){
        println(names)
    }
}

fun robot(age:Int){
    if(age<6){
        println("Serve glass of milk")
    }
    else{
        if (age>6 && age<15){
            println("Serve bottle of fanta orange")
        }
        else
            println("Serve bottle of cocacola")
    } }

fun number() {
    for (num in 1..100) {
        if (num%3!==0 && num%5==0) {
            println("FizzBuzz")
        }
        else
            if (num%3==0){
                println("Fizz")
            }
        else if(num%5==0){
            println("Buzz")
            }
    else
    println(num)
    } }