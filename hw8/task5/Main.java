package hw8.task5;

public class Main {
    static void main(String[] args) {
        Animal cat = new Animal("cat", 100, true);
        Animal cat2 = new Animal("dog", 100, true);

        Animal garlic = new Animal("fake animal", 12000, false);
        Animal onion = new Animal("fake animal", 12000, false);

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat.equals(cat2));
        System.out.println(cat.hashCode());

        System.out.println();

        System.out.println(garlic);
        System.out.println(onion);
        System.out.println(garlic.equals(onion));
        System.out.println(garlic.hashCode());
    }
}
