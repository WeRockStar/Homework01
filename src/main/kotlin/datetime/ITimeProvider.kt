package datetime

import java.time.LocalDateTime

interface ITimeProvider {
    fun current(): LocalDateTime
}