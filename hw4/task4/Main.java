package hw4.task4;

public class Main {
    static void main() {
        Celsius c = new Celsius(14);
        Fahrenheit f = new Fahrenheit(85);
        Kelvin k = new Kelvin(103);

        System.out.println("celsius: ");
        System.out.println(c.toCelsius());
        System.out.println(c.toFahrenheit());
        System.out.println(c.toKelvin());

        System.out.println("\nfahrenheit: ");
        System.out.println(f.toCelsius());
        System.out.println(f.toFahrenheit());
        System.out.println(f.toKelvin());

        System.out.println("\nkelvin: ");
        System.out.println(k.toCelsius());
        System.out.println(k.toFahrenheit());
        System.out.println(k.toKelvin());
    }
}

// не особо понял смысл задания