package datetime

class GreetingDateTime(private val dateTime: DateTimeManager) {
    fun getNowString() = dateTime.now()
}