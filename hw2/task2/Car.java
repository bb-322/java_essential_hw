package hw2.task2;

public class Car {
    int year;
    String color;

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year) {
        this.year = year;
        this.color = "white";
    }

    public Car() {
        this.year = 2010;
        this.color = "black";
    }
}
