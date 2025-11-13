package hw5.task4;

import java.util.*;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }

        System.out.println(list);

        ListIterator<Integer> iter = list.listIterator();

        while (iter.hasNext()) {
            int val = iter.next();
            iter.set(++val);
        }

        System.out.println(list);


    }
}
