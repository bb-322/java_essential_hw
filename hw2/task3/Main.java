package hw2.task3;

public class Main {
    static void main() {
        Car car1 = new Car();
        Car car2 = new Car(1999);
        Car car3 = new Car(2000, 900);
        Car car4 = new Car(2001, 800, 200.00d);
        Car car5 = new Car(2005, 700, 280.00d, "red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
