package hw4.task2;

public class Main {
    static void main() {
        AbstractHandler xml = new XMLHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler doc = new DOCHandler();

        System.out.println("xml: ");
        xml.open();
        xml.create();
        xml.change();
        xml.save();

        System.out.println("\ntxt: ");
        txt.open();
        txt.create();
        txt.change();
        txt.save();

        System.out.println("\ndoc: ");
        doc.open();
        doc.create();
        doc.change();
        doc.save();

    }
}
