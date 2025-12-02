package hw9.task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dict = new MyDictionary<>();

        dict.add(277, "hello");
        dict.add(535, "world");

        System.out.println("size = " + dict.size());
        System.out.println(dict.get(277));
        System.out.println(dict.get(535));
        System.out.println(dict.get(0));
    }
}