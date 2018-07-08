package datetime

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

open class DateTimeService(private val timeProvider: ITimeProvider) {

    private val formatter by lazy { DateTimeFormatter.ofPattern("yyyy/MM/dd_HH:mm:ss.SSS") }

    open fun now(): String {
        return timeProvider.current().format(formatter)
    }
}
