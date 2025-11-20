package hw7.task2;

import java.util.Scanner;

public class Worker {
    String name, job;
    int yearCame;

    public Worker(String name, String job, int yearCame) {
        this.name = name;
        this.job = job;
        this.yearCame = yearCame;
    }

    public static Worker addWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter worker's surname with initials: ");
        String name = sc.nextLine();

        System.out.print("enter worker's job: ");
        String job = sc.nextLine();

        int yearCame;
        while (true) {
            System.out.print("enter the year when this worker came: ");
            try {
                yearCame = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("year should be integer");
                sc.nextLine();
            }
        }

        return new Worker(name, job, yearCame);
    }

    @Override
    public String toString() {
        return (this.name + "\n");
    }

    public String getInfo(Worker worker) {
        return "Worker %s\n\tjob: %s\n\tcame in: %d".formatted(worker.name, worker.job, worker.yearCame);
    }
}
