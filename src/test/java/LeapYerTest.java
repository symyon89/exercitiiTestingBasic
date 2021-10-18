import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYerTest {
    //un an bisect se imparte la 4 nu se imparte la 100 , dar o fata la 400 de ani este an bisect;

    @Test
    public void leapYearIsDivisibleBy4(){
        int year = 2020;
        assertTrue(LeapYear.isLeapYear(year));
    }
    @Test
    public void leapYearIsDivisibleBy40(){
        int year = 1900;
        assertFalse(LeapYear.isLeapYear(year));
    }
    @Test
    public void leapYearIsDivisibleBy400(){
        int year = 2000;
        assertTrue(LeapYear.isLeapYear(year));
    }
}
