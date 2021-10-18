public class LeapYear {
    public static boolean isLeapYear(int year){
      //  return year % 4 == 0 && !(year % 100 == 0) || (year % 400 == 0);
        return isDivisible(year,4) && !isDivisible(year,100) || isDivisible(year,400);
    }
    public static boolean isDivisible(int year, int denominator){
        return year % denominator == 0;
    }
}
