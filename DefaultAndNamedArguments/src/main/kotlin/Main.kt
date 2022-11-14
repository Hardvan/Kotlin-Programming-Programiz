
fun displayBorder(character: Char = '=', length: Int = 10)
{
    for (i in 1..length)
    {
        print(character)
    }
}

fun main(args: Array<String>)
{
    // Default Argument
    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as the first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as the first argument.")
    println("5 is used as the second argument")
    println("Output when both arguments are passed:")
    displayBorder('*', 5)

    // Named Argument
    println("\n\nUsing named argument for length")
    displayBorder(length = 5)


}