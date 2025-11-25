package hw8.task5;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return ("Name: %s, age: %d, has tail: %b".formatted(name, age, hasTail));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && hasTail == animal.hasTail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }
}
