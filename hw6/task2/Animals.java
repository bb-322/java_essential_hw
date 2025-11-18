package hw6.task2;

public enum Animals {
    CAT( 100),
    DOG(400),
    BIRB(1),
    MOUSE(2147483647);

    private final int age;

    Animals (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age: %d\nname: %s".formatted(age, name());
    }
}