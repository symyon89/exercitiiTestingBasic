import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstJunitClass {

    @Test
    public void myFirstTest() {
        assertEquals(64, 2 * 32);
        assertNotEquals(12, 2 + 15);
    }

    @Test
    public void myFirstTrueFalse() {
        assertTrue(3 == 3);
        assertFalse("Hello".equals("World"));
    }

    @Test
    public void myFirstNullTest() {
        String firstString = "abc";
        String secondString = null;

        assertNotNull(firstString);
        assertNull(secondString);
    }

    @Test
    public void assertSameTest() {
        String firstString = "abc";
        String secondString = "abc";
        String thirdString = new String("abc");

        assertSame(firstString, secondString);
        assertNotSame(firstString, thirdString);
    }

    @Test
    public void arrayEqualsTest() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3}; // verifica si chiar daca este diferit un singur element
        assertArrayEquals(firstArray, secondArray);
    }
}
