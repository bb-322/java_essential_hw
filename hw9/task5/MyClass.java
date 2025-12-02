package hw9.task5;

public class MyClass<T> {

    static public <T> T factoryMethod(Class<T> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public MyClass() {
        System.out.println("created");
    }
}
