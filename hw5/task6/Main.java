package hw5.task6;

import java.util.*;

public class Main {
    static void main() {
        List<String> teachers = new ArrayList<>();

        teachers.add("bad teacher");
        teachers.add("worst teacher");
        teachers.add("mid teacher");
        teachers.add("good teacher");
        teachers.add("very good teacher");

        System.out.println("best teacher's idx: " + teachers.indexOf("very good teacher"));
        System.out.println("worst teacher's idx: " + teachers.indexOf("worst teacher"));

        System.out.println(teachers);
    }
}
