package hw3.task6;

public class Main {
    static void main() {
        Printer r = new RedPrinter();
        ((RedPrinter)r).print("hell, world");

        Printer g = new GreenPrinter();
        ((GreenPrinter)g).print("hell, world");

        Printer b = new BluePrinter();
        ((BluePrinter)b).print("hell, world");
    }
}

// не понял в чем тут прикол приведения типов, спросил у LLM-ки и он сказал чисто формальность