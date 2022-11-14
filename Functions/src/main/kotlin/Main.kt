
var slno = 1

fun displayTitle(text: String)
{
    println("${slno++}) $text")
}

fun line()
{
    println("____________________________\n")
}

fun callMe()
{
    println("Inside callMe() function.")
    println("Still inside...")
}

fun addNumbers(n1: Double, n2:Double): Int
{
    var sum = n1 + n2
    var sumInt = sum.toInt()
    return sumInt
}

// You can omit the curly braces { } of the function body
// and specify the body after = symbol if the function returns a single expression
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

// OR
// fun getName(firstName: String, lastName: String): = "$firstName $lastName"


fun main(args: Array<String>)
{
    // Standard Library Functions
    displayTitle("Standard Library Functions")

    var number = 2.0
    println("Square root of $number = ${Math.sqrt(number)}")

    line()

    // User Defined Functions
    displayTitle("User Defined Functions")

    // no return value
    println("No Return Value Function:")
    callMe()
    println("Outside callMe() function.\n")

    // with return value
    println("With Return Value Function:")
    var n1 = 10.1
    var n2 = 5.3
    var sum: Int
    sum = addNumbers(n1, n2)
    println("10 + 5 = $sum\n")

    // Displaying Name
    println("Displaying Name:")
    println(getName("Hardik","Pawar"))



}