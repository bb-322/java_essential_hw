package hw2.task2;

public class Main {
    static void main() {
        Car car1 = new Car(2000, "red");
        Car car2 = new Car(2015);
        Car car3 = new Car();

        System.out.println("year: " + car1.year + "\ncolor:" + car1.color);
        System.out.println();
        System.out.println("year: " + car2.year + "\ncolor:" + car2.color);
        System.out.println();
        System.out.println("year: " + car3.year + "\ncolor:" + car3.color);
        System.out.println(car1);
    }
}
