package hw1.task2;

import java.util.Scanner;

public class Rectangle {

    double side1, side2;


    protected double areaCalculator(double side1, double side2) {
        return (side1 * side2);
    }

    protected double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        while (true) {
            System.out.print("side1: ");
            rect.side1 = sc.nextDouble();
            System.out.print("side2: ");
            rect.side2 = sc.nextDouble();

            System.out.println("area: " + rect.areaCalculator(rect.side1, rect.side2));
            System.out.println("perimeter: " + rect.perimeterCalculator(rect.side1, rect.side2));
        }
    }
}
