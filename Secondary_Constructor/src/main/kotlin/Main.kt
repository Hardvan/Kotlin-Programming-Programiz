/*
Secondary Constructors are created using constructor keyword.

They are not that common in Kotlin.
The most common use of secondary constructor comes up
when you need to extend a class that provides
multiple constructors that initialize the class in different ways.
*/


fun main(args: Array<String>)
{
    val p1 = AuthLog("Bad Password")
}

open class Log
{
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String)
    {

    }
    constructor(_data: String, _numberOfData: Int)
    {
        data = _data
        numberOfData = _numberOfData
        println("$data: $_numberOfData times")
    }
}

class AuthLog: Log
{
    constructor(_data: String): this("From AuthLog -> " + _data, 69)
    {

    }
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData)
    {

    }
}