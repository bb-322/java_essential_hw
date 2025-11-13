package hw5.task3;

import java.util.ArrayList;
import java.util.List;

public class Zoo2 {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("bird");
        list.add("rabbit");
        list.add("fox");
        list.add("monkey");
        list.add("elephant");
        list.add("fly");
        list.add("dog");

        System.out.println(list + ", " + list.size());

        for (int i = 3; i > 0; i--) {
            list.removeLast();
        }
        System.out.println(list + ", " + list.size());

        for (int i = 2; i > 0; i--) {
            for (int x = 2; x > 0; x--) {
                list.removeLast();
            }
            System.out.println(list + ", " + list.size());
        }
    }
}
