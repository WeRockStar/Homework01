package datetime

class DateTimer(private val dateTime: DateTimeService) {
    
    fun getNowString() = dateTime.now()
}