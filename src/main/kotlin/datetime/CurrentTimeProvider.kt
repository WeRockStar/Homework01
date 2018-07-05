package datetime

import java.time.LocalDateTime

class CurrentTimeProvider : ITimeProvider {
    override fun current(): LocalDateTime {
        return LocalDateTime.now()
    }

}