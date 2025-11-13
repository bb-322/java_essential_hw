package hw5.task5;

import java.util.*;

public class Friends {
    static void main() {
        List<String> friends = new ArrayList<>();

        friends.add("x fienf");
        friends.add("d friend");
        friends.add("a frfie");

        System.out.println(friends);

        Collections.sort(friends);
        System.out.println(friends);

    }
}
