package hw8.task234;

public class Main {
    static void main(String[] args) {
        Device d = new Device("pepol", "QWERTY83428", 100.22f);
        Device d2 = new Device("pepol", "QWERTY83428", 100.22f);

        Monitor m = new Monitor("glass", "YTREWQ1389052", 366.77f,
                1920, 1080);
        Monitor m2 = new Monitor("glass", "anotherNumber", 366.77f,
                1920, 1080);

        EthernetAdapter ea = new EthernetAdapter("internet", "ASDFGH135890", 50,
                100, "mac");
        EthernetAdapter ea2 = new EthernetAdapter("anotherManufacturer", "ASDFGH135890", 50,
                100, "mac");

        System.out.println("====DEVICE====");
        System.out.println("d: " + d);
        System.out.println("d2: " + d2);
        System.out.println(d.equals(d2));
        System.out.println(d.hashCode());

        System.out.println();

        System.out.println("====MONITOR====");
        System.out.println("m: " + m);
        System.out.println("m2: " + m2);
        System.out.println(m.equals(m2));
        System.out.println(m.hashCode());

        System.out.println();

        System.out.println("====ETHERNET ADAPTER====");
        System.out.println("ea: " + ea);
        System.out.println("ea2: " + ea2);
        System.out.println(ea.equals(ea2));
        System.out.println(ea.hashCode());
    }
}
