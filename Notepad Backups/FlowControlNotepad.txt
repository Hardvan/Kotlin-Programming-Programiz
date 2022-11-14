

fun main(args: Array<String>)
{
    var slno = 1
    // If the block of if branch contains more than one expression,
    // the last expression is returned as the value of the block.

    //IF ELSE IF LADDER
    println("\n${slno++}) If Else If Ladder")
    val number = 0

    val result = if (number > 0)
        "Positive Number"
    else if (number < 0)
        "Negative Number"
    else
        "Zero"

    println("The number is: $result")

    //NESTED IF EXPRESSION
    println("\n${slno++}) Nested If Expression")

    val n1 = 1
    val n2 = 2
    val n3 = 3

    println("n1 = $n1, n2 = $n2, n3 = $n3")

    val max = if (n1 > n2)
    {
        if (n1 > n3)
            n1
        else
            n3
    }
    else
    {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("Max = $max")

    //WHEN CONSTRUCT
    println("\n${slno++}) when Construct")

    val a = 12
    val b = 5
    var choice = 2

    println("a = $a, b = $b")

    println("Enter an operator +,-,*,/,% : ")
    val operator = readLine()

    if (choice == 1)
    {   //when as an expression
        var result2 = when (operator)
        {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            "%" -> a % b
            else -> "$operator operator is invalid."
        }

        println("Result = $result2")
    }
    else if (choice == 2)
    {
        when (operator)
        {
            "+" -> println("$a + $b = ${a+b}")
            "-" -> println("$a - $b = ${a-b}")
            "*" -> println("$a * $b = ${a*b}")
            "/" -> println("$a / $b = ${a/b}")
            "%" -> println("$a % $b = ${a%b}")
            else -> println("$operator is invalid")
        }
        // In this case, the else branch is not mandatory.
    }

    //Combining Conditions
    println("\nCombining Conditions")

    var n = -1
    when (n)
    {
        1,2,3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero.")
        -1,-2 -> println("n is a negative number greater than -3")
    }

    //Checking in a Range
    println("\nChecking in a Range")

    n = 100
    when (n)
    {
        in 1..10 -> println("From to 1 to 10")
        in 10..100 -> println("From to 10 to 100")
    }

    // To check whether a value is of a particular type in runtime,
    // we can use is and !is operator.

    // WHILE LOOP
    println("\n${slno++}) While Loop")

    // Program to compute the sum of natural numbers from 1 to 100.
    var sum = 0
    var i = 100
    while (i!=0)
    {
        sum += i // OR sum += i--
        --i
    }
    println("Sum = $sum")

    //DO WHILE LOOP
    println("\n${slno++}) Do While loop")

    // Program to calculate the sum of numbers entered by the user until user enters 0.
    sum = 0
    var input: String
    do
    {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")
    println("Sum = $sum")

    // FOR LOOP
    println("\n${slno++}) For Loop")

    // Iterating through a Range
    for (i in 1..5)
    {
        print("$i ")
    }
    println()

    // Different ways to Iterate through a Range

    print("for (i in 1..5) = ")
    for (i in 1..5) print("$i ")

    println()

    print("for (i in 5..1) = ")
    for (i in 5..1) print("$i ")    //prints nothing

    println()

    print("for (i in 5 downTo 1) = ")
    for (i in 5 downTo 1) print("$i ")

    println()

    print("for (i in 1..5 step 2) = ")
    for (i in 1..5 step 2) print("$i ")

    println()

    print("for (i in 5 downTo 1 step 2) = ")
    for (i in 5 downTo 1 step 2) print("$i ")

    println()

    // Iterating through an Array
    var language = arrayOf("Java", "Python", "C", "Kotlin")
    for (item in language)
    {
        println(item)
    }

    // Iterating using Index
    for (item in language.indices) // indices returns the range of valid indices for the array.
    {
        if (item%2 == 0) // printing elements with even index only
            println(language[item])
    }

    // BREAK
    println("\n${slno++} break Expression")

    // What you have learned till now is an unlabeled form of break
    // which terminates the nearest enclosing loop.
    // There is another way break can be used (labeled form)
    // to terminate the desired loop.

    // Label in Kotlin starts with an identifier which is followed by @.

    first@ for (i in 1..4)
    {
        second@ for (j in 1..2)
        {
            println("i = $i; j = $j")
            if (i == 2)
                break@first
        }
    }

    // CONTINUE
    println("\n${slno++} continue Expression")

    //What you have learned till now is unlabeled form of continue
    // which skips current iteration of the nearest enclosing loop.
    // continue can also be used to skip the iteration of the desired loop
    // by using continue labels.

    here@ for (i in 1..5)
    {
        for (j in 1..4)
        {
            if (i == 3 || j == 3)
                continue@here
            println("i = $i; j = $j")
        }
    }
    // The use of labeled continue is often discouraged as it makes your code hard to understand.



}