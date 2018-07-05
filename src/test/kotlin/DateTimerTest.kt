import datetime.DateTimeService
import datetime.DateTimer
import org.junit.Assert.assertEquals
import org.junit.Test

class DateTimerTest {

    @Test
    fun `when call getNowString() should see current datetime`() {
        val dateTimeManager = StubDateTimeService()
        val greetingDateTime = DateTimer(dateTimeManager);

        val expected = "2018/07/04_18:00:40.000"

        assertEquals(expected, greetingDateTime.getNowString())
    }

    class StubDateTimeService : DateTimeService() {
        override fun now() = "2018/07/04_18:00:40.000"
    }
}