package hw7.task5;

public class Calculator {

    public static int add(int val1, int val2) {
        return val1 + val2;
    }

    public static int sub(int val1, int val2) {
        return val1 - val2;
    }

    public static int mul(int val1, int val2) {
        return val1 * val2;
    }

    public static int div(int val1, int val2) throws ArithmeticException {
        if (val2 == 0) {
            throw new ArithmeticException("division by 0");
        } else {
            return val1/val2;
        }
    }
}
