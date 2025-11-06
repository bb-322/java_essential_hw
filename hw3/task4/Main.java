package hw3.task4;

import java.util.Scanner;

public class Main {
    static void main() {
        int key;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter key: ");
            key = sc.nextInt();
            DocumentWorker w = WorkerFactory.createWorker(key);
            w.openDoc();
            w.editDoc();
            w.saveDoc();
            System.out.println("-----------------------");
        }
    }
}
