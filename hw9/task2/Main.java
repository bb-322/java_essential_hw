package hw9.task2;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("hello");
        list.add("world");

        System.out.println("size = " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}