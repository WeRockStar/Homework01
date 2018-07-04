import datetime.DateTimeManager
import datetime.GreetingDateTime
import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingDateTimeTest {

    @Test
    fun `when call getNowString() should see current datetime`() {
        val dateTimeManager = MockDateTimeManager()
        val greetingDateTime = GreetingDateTime(dateTimeManager);

        val expected = "2018/07/04_18:00:40.000"

        assertEquals(expected, greetingDateTime.getNowString())
    }

    class MockDateTimeManager : DateTimeManager() {
        override fun now() = "2018/07/04_18:00:40.000"
    }
}