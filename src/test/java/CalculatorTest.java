import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static void setUpBeforeAllTests() {
        System.out.println("Start : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @AfterAll
    public static void setUpAfterAll() {
        System.out.println("Stop : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Prints before each test");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Prints after each test");
        calculator = new Calculator();
    }

    @Test
    @Disabled // daca astept niste rezultate si nu vreau sa ruleze
    public void addTest() {
        // given

        double firstParam = 10;
        double secondParam = 20;
        double expectedResult = 30;
        //when
        Double result = calculator.add(firstParam, secondParam);
        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void substractTest() {
        //given
        //Calculator calculator = new Calculator();
        double firstParam = 20;
        double secondParam = 20;
        double expectedResult = 0;
        //when
        Double result = calculator.substract(firstParam, secondParam);
        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
        assertNotEquals(10, result);
    }

    @Test
    public void multiplyTest() {
        //given
        //Calculator calculator = new Calculator();
        double firstParam = 2;
        double secondParam = 2;
        double expectedResult = 4;
        //when
        Double result = calculator.mulpiply(firstParam, secondParam);
        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
        assertNotEquals(10, result);
    }

    @Test
    public void divideTest() {
        //given
        //Calculator calculator = new Calculator();
        double firstParam = 2;
        double secondParam = 2;
        double expectedResult = 1;
        //when
        Double result = calculator.divide(firstParam, secondParam);
        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
        assertNotEquals(10, result);
    }

    @Test
    @DisplayName("This is the test for the substration method in Calculator Class")
    public void divideWithZeroTest() {
        //given
        //Calculator calculator = new Calculator();
        double firstParameter = 15;
        double secondParameter = 0;
        Double expectedResult = null;
        //when
        Double result = calculator.divide(firstParameter, secondParameter);
        //then
        assertNull(result);
    }

    @Test
    public void reverseSignTest() {
        //given
        //Calculator calculator = new Calculator();
        double firstParam = 2;
        double expectedResult = -2;
        //when
        Double result = calculator.reverseSign(firstParam);
        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
        assertNotEquals(2, result);
    }

    @Test
    public void additionWithMultipleInputsTest() {
        assertAll(() -> assertEquals(4, calculator.add(2, 2)),
                () -> assertEquals(6, calculator.add(2, 4)),
                () -> assertEquals(10, calculator.add(2, 2)),
                () -> assertEquals(4, calculator.add(2, 2)),
                () -> assertEquals(4, calculator.add(2, 2)),
                () -> assertEquals(4, calculator.add(2, 2))
        );
    }

}
