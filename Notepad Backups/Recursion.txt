import java.util.Scanner
import java.math.BigInteger

fun factorial(n: Int): Long
{
    return if (n == 1) n.toLong() else n * factorial(n-1)
}

tailrec fun fibonacci(n: Int, first: BigInteger, second: BigInteger): BigInteger
{
    return if (n == 0) first else fibonacci(n-1, second, first+second)
}

fun main(args: Array<String>)
{
    // NORMAL RECURSION
    var number: Int
    var result: Long

    print("Enter a number: ")
    val reader = Scanner(System.`in`)
    number = reader.nextInt()

    result = factorial(number)
    println("Factorial of $number = $number! = $result")

    // TAIL RECURSION
    /*
    In normal recursion, you perform all recursive calls first,
    and calculate the result from return values at last (as show in the above example).
    Hence, you don't get result until all recursive calls are made.
    In tail recursion, calculations are performed first, then recursive calls are executed
    (the recursive call passes the result of your current step to the next recursive call).
    This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.

    Condition for tail recursion
    A recursive function is eligible for tail recursion if the function call to itself
    is the last operation it performs.

    To tell compiler to perform tail recursion in Kotlin,
    you need to mark the function with tailrec modifier.
    */

    // This program computes the 100th term of the Fibonacci series.
    // Since, the output can be a very large integer,
    // we have imported BigInteger class from Java standard library.
    var n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))


}