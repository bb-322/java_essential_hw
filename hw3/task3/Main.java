package hw3.task3;

public class Main {
    static void main() {
        Plane p = new Plane(10.00d, 20.00d, 120000, 800, 2019, 10, 150);
        Car c = new Car(5.00d, 7.50d, 4000, 180, 2022);
        Ship s = new Ship(15.00d, 20.00d, 120000, 120, 2024, 4301, 400);

        System.out.println("Plane: ");
        p.inspect();
        System.out.println();
        System.out.println("Car: ");
        c.inspect();
        System.out.println();
        System.out.println("Ship: ");
        s.inspect();
    }
}
