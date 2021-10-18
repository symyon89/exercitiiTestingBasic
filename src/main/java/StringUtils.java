public class StringUtils {
    public static Double convertToDouble(String myString) {
        if (myString != null) {
            return Double.valueOf(myString);
        }
        return null;
    }

    public static String getStringInCapitalLetters(String myString) {
        if (myString != null) {
            return myString.toUpperCase();
        }
        throw new NumberFormatException("Wrong Input");
    }

    public static boolean isNullOrBlank(String myString) {
        return myString == null || myString.trim().length() == 0;
    }

    public static String getDefaultIfNull(String myString, String defaultString) {
        return myString == null ? defaultString : myString;
    }

    public static String concat(String[] strings) {
        String returnedString = null;
        if (strings != null && strings.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String st : strings) {
                if (st != null) {
                    sb.append(st);
                }
            }
            returnedString = sb.toString();
        }
        return returnedString;
    }
}
