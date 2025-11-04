package hw2.task3;

public class Car {
    int year, weight;
    double speed;
    String color;

    public Car() {
        this.year = 2010;
        this.weight = 750;
        this.speed = 240.0d;
        this.color = "black";
    }

    public Car(int year) {
        this.year = year;
        this.weight = 750;
        this.speed = 240.0d;
        this.color = "black";
    }

    public Car(int year, int weight) {
        this.year = year;
        this.weight = weight;
        this.speed = 240.0d;
        this.color = "black";
    }

    public Car(int year, int weight, double speed) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = "black";
    }

    public Car(int year, int weight, double speed, String color) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return """
                Car {
                    year: %d;
                    weight: %d;
                    speed: %.2f;
                    color: %s
                }
            """.formatted(year, weight, speed, color);
    }
}
