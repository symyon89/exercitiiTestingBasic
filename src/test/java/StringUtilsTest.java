import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void convertToDoubleTest() {
        //given
        String age = null;
        //when
        Double result = StringUtils.convertToDouble(age);
        //then
        assertThrows(NumberFormatException.class, () ->StringUtils.convertToDouble(age));
        assertNotNull(result);
        assertEquals(1990, result);
    }

    @Test
    public void convertToDoubleTestIfNull() {
        //given
        String age = null;
        // when
        Double result = StringUtils.convertToDouble(age);
        //then
        assertNull(result);
    }

    @Test
    public void getStringsInCapitalLettersTest() {
        //given
        String name = "Andrei";
        String expected = "ANDREI";
        //when
        String result = StringUtils.getStringInCapitalLetters(name);
        // then
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void getStringsInCapitalLetterWithNullTest() {
        //given
        String name = null;
        //when
        String result = StringUtils.getStringInCapitalLetters(name);
        //then
        assertNull(result);
        assertEquals(null, result);
    }

    @Test
    public void isNullOrBlankTest() {
        //given
        String strTest = "";
        //when
        boolean result = StringUtils.isNullOrBlank(strTest);
        //then
        assertTrue(result);
    }

    @Test
    public void isNullOrBlankWithNullTest() {
        //given
        String strTest = null;
        //when
        boolean result = StringUtils.isNullOrBlank(strTest);
        //then
        assertTrue(result);
    }

    @Test
    public void isNullOrBlankWithStringCompletedTest() {
        //given
        String strTest = "abc";
        //when
        boolean result = StringUtils.isNullOrBlank(strTest);
        //then
        assertFalse(result);
    }

    @Test
    public void getDefaultIfNullTest() {

        // given
        String myString = null;
        String defaultString = "test";
        //when
        String result = StringUtils.getDefaultIfNull(myString, defaultString);
        //then
        assertNotNull(result);
        assertEquals(defaultString, result);
    }

    @Test
    public void getDefaultIfNotNullTest() {

        // given
        String myString = "null";
        String defaultString = "test";
        //when
        String result = StringUtils.getDefaultIfNull(myString, defaultString);
        //then
        assertNotNull(result);
        assertEquals("null", result);
    }

    @Test
    public void concatWithNullTest(){
        String[] myString = null;
        String result = StringUtils.concat(myString);
        assertNull(result);
    }
    @Test
    public void concatWithZeroLenght(){
        String[]myString = new String[0];

        //when
        String result = StringUtils.concat(myString);

        //then
        assertNull(result);
    }
    @Test
    public void contactWithNullValues(){
        String[]myString = {null,null,null};

        //when
        String result = StringUtils.concat(myString);

        //then
        assertTrue(result.isEmpty());
    }
    @Test
    public void contactWithOneNullValues(){
        String[]myString = {"null",null,"null"};

        //when
        String result = StringUtils.concat(myString);

        //then
        assertEquals("nullnull",result);
    }
    @Test
    public void conctatTest(){
        String[]myString = {"null","null","null"};

        //when
        String result = StringUtils.concat(myString);

        //then
        assertEquals("nullnullnull",result);
    }

}