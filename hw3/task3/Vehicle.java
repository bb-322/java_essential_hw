package hw3.task3;

public class Vehicle {
    double x, y;
    int price, speed, year;

    Vehicle(double x, double y, int price, int speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void inspect() {
        System.out.println("coords: " + x + ',' + y);
        System.out.println("price: " + price + "$");
        System.out.println("speed: " + speed + " km/h");
        System.out.println("year: " + year);
    }
}

class Plane extends Vehicle {
    int max_height, max_passengers;

    Plane(double x, double y, int price, int speed, int year, int max_height, int max_passengers) {
        super(x, y, price, speed, year);
        this.max_height = max_height;
        this.max_passengers = max_passengers;
    }

    @Override
    public void inspect() {
        super.inspect();
        System.out.println("max height: " + max_height + " km");
        System.out.println("max passengers: " + max_passengers);
    }
}

class Car extends Vehicle {
    Car(double x, double y, int price, int speed, int year) {
        super(x, y, price, speed, year);
    }
}

class Ship extends Vehicle {
    int port, max_passengers;

    Ship(double x, double y, int price, int speed, int year, int port, int max_passengers) {
        super(x, y, price, speed, year);
        this.port = port;
        this.max_passengers = max_passengers;
    }

    @Override
    public void inspect() {
        super.inspect();
        System.out.println("port: " + port);
        System.out.println("max passengers: " + max_passengers);
    }
}
