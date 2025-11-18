package hw6.task4;

public enum Vehicles {
    TESLA(1, "black"),
    CART(2147483647, "hell"),
    BUS(100, "green");

    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        String displayName = switch(this) {
            case CART -> "𖥐ꗇ𖦪ꖡ";
            default -> name();
        };

        return ("======%s======\nprice: %d\ncolor: %s\n").formatted(displayName, this.price, this.getColor());
    }
}