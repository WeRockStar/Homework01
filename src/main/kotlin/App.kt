import datetime.DateTimeService
import datetime.DateTimer

fun main(args: Array<String>) {
    val dateTimeManager = DateTimeService()
    val greetingDateTime = DateTimer(dateTimeManager)
    println(greetingDateTime.getNowString())
}