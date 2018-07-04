import datetime.DateTimeManager
import datetime.GreetingDateTime

fun main(args: Array<String>) {
    val dateTimeManager = DateTimeManager()
    val greetingDateTime = GreetingDateTime(dateTimeManager)
    println(greetingDateTime.getNowString())
}