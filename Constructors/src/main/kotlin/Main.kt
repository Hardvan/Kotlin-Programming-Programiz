
// A constructor is a concise way to initialize class properties.

/*
In Kotlin, there are two constructors:

Primary constructor: concise way to initialize a class. Part of class header.
Secondary constructor: allows you to put additional initialization logic
 */

class Person(val firstName: String, var age: Int)
{

}

fun main(args: Array<String>)
{
    // PRIMARY CONSTRUCTOR
    val person1 = Person("Hardik", 69)

    println("First Name: ${person1.firstName}")
    println("Age: ${person1.age}")

}