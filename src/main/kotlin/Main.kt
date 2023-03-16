fun main() {
var ans = odd()
    var longest=longer( arrayOf("Karina","Maa", "Kenyatta","Mariam"))
println(longest)
var robot= party(15)
    var multiples= numero(1..100)


}
//Create a function that prints out all the odd numbers between 1 and 100
fun odd (){
  var digit= 1..100

    for (i in 1..100 )
        if (i %3 ==0){
            println(i)}

}

// find the total of the words whose length exceed 5
fun longer (array: Array<String>):Int {
    var sum = 0
    for (num in array) {

        if (num.length > 5) {
     sum++}

    }
    return sum
}

// Robot serves milk to 6 year olds and below for 6-15 year olds are given
//fanta soda. 15 year olds and above are given coca cola

fun party(age:Int){
    if (age<6){
        println("milk")}
    else if (age<15){
        println("fanta soda")}
    else {println("coca cola")}


    }

// multiples of 3 print fizz , multiples of 5 buzz, multiples of both 5 and 3 prints buzzfizz
fun numero (range:IntRange) {

    for (n in range)
when{
    (n % 3 == 0 && n % 5 == 0) -> {
        println("fizzbuzz")}
         (n % 3 == 0) -> {
            println("fizz")}
          (n % 5 == 0) -> {
            println("buzz")}
}}

