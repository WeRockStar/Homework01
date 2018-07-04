package datetime

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

open class DateTimeManager {

    private val formatter by lazy { DateTimeFormatter.ofPattern("yyyy/MM/dd_HH:mm:ss.SSS") }
    private val current by lazy { LocalDateTime.now() }

    open fun now(): String {
        return current.format(formatter)
    }
}
