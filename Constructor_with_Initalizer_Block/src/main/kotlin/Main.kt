

fun main(args: Array<String>)
{
    val person1 = Person("hardik", 69)
}

class Person(fName: String, personAge: Int)
{
    val firstName: String
    var age: Int

    /*
    To put the initilization code, initializer block is used.
    It is prefixed with init keyword.
     */

    // Initializer Block
    init
    {
        firstName = fName.capitalize()
        age = personAge

        println("First Name: $firstName")
        println("Age: $age")
    }

    // However, fName and personAge are used without using var or val
    // and are not properties of the Person class.

    // It's more common to use _firstName and _age
    // instead of completely different name for constructor parameters.
}