
// A class is a blueprint for the object.

/*
Visibility Modifiers:
private - visible (can be accessed) from inside the class only.
public - visible everywhere. (default)
protected - visible to the class and its subclass.
internal - any client inside the module can access them.
 */

// You can access properties and member functions of a class by using '.' notation.
// For example: l1.turnOn()

class Lamp
{
    // Property (data member)
    private var isOn: Boolean = false

    // Member Functions
    fun turnOn()
    {
        isOn = true
    }

    fun turnOff()
    {
        isOn = false
    }

    fun displayLightStatus(lamp: String)
    {
        if (isOn == true)
            println("$lamp lamp is switched on.")
        else
            println("$lamp lamp is switched off.")
    }
}

fun main(args: Array<String>)
{
    val l1 = Lamp() // Create l1 object of Lamp class
    val l2 = Lamp() // Create l2 object of Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")


}