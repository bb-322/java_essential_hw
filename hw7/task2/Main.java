package hw7.task2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    static void main() {
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.format("\n====== Worker %d ======", i + 1);
            System.out.println();
            Worker newWorker = Worker.addWorker();
            workers.add(newWorker);
            ListIterator<Worker> iter = workers.listIterator();

            Worker oldest = iter.next();
            int y = oldest.yearCame;

            while (iter.hasNext()) {
                Worker next = iter.next();
                if (next.yearCame < y) {
                    y = next.yearCame;
                    oldest = next;
                }
            }
            System.out.format("\noldest worker: " + oldest);
        }
    }
}
