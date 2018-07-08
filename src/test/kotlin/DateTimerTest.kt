import datetime.DateTimeService
import datetime.DateTimer
import datetime.ITimeProvider
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDateTime

class DateTimerTest {

    @Test
    fun `when call getNowString() should see current datetime`() {
        val dateTimeManager = StubTimeProvider()
        val greetingDateTime = DateTimeService(dateTimeManager)

        val expected = "2018/07/04_18:00:40.000"

        assertEquals(expected, greetingDateTime.now())
    }

    class StubTimeProvider : ITimeProvider {
        override fun current(): LocalDateTime = LocalDateTime.of(2018, 7, 4, 18, 0, 40)
    }
}