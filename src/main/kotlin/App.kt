import datetime.CurrentTimeProvider
import datetime.DateTimeService
import datetime.DateTimer

fun main(args: Array<String>) {
    val dateTimeManager = DateTimeService(CurrentTimeProvider());
    val dateTime = DateTimer(dateTimeManager)

    println(dateTime.getNowString())
}