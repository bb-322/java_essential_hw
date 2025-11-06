package hw3.task6;

public class Printer {
    String reset = "\u001B[0m";

    void print(String val) {
        System.out.println(val);
    }
}

class RedPrinter extends Printer {
    String red = "\u001B[31m";

    @Override
    void print(String val) {
        System.out.println(red + val + reset);
    }
}

class GreenPrinter extends Printer {
    String green = "\u001B[32m";

    @Override
    void print(String val) {
        System.out.println(green + val + reset);
    }
}

class BluePrinter extends Printer {
    String blue = "\u001B[34m";

    @Override
    void print(String val) {
        System.out.println(blue + val + reset);
    }
}