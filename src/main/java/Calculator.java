public class Calculator {
    public Double add(double a, double b) {
        return a + b;
    }

    public Double substract(double a, double b) {
        return a - b;
    }

    public Double mulpiply(double a, double b) {
        return a * b;
    }

    public Double divide(double a, double b) {
        if (b == 0){
            return null;
        }
        return a / b;
    }

    public Double reverseSign(double a) {
        return -1 * a;
    }

}
