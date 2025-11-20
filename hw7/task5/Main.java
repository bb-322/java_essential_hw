package hw7.task5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter first value: ");
            int val1 = sc.nextInt();

            System.out.print("enter second value: ");
            int val2 = sc.nextInt();

            sc.nextLine();
            System.out.print("enter operation: ");
            String op = sc.nextLine();

            switch(op) {
                case "add":
                    System.out.println(Calculator.add(val1, val2));
                    break;

                case "sub":
                    System.out.println(Calculator.sub(val1, val2));
                    break;

                case "mul":
                    System.out.println(Calculator.mul(val1, val2));
                    break;

                case "div":
                    System.out.println(Calculator.div(val1, val2));
                    break;

                default:
                    break;
            }
        }
    }
}
