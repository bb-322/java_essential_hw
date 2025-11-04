package hw2.task4;

public class Car {
    int year, weight;
    double speed;
    String color;

    public Car() {
        this(2010, 750, 240.00d, "black");
    }

    public Car(int year) {
        this(year, 750, 240.00d, "black");
    }

    public Car(int year, int weight) {
        this(year, weight, 240.00d, "black");
    }

    public Car(int year, int weight, double speed) {
        this(year, weight, speed, "black");
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
