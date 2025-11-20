package hw7.task3;

import java.util.Scanner;

public class Price implements Comparable<Price> {
    String name, store;
    int price;

    public Price(String name, String store, int price) {
        this.name = name;
        this.store = store;
        this.price = price;
    }

    public static Price addProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nenter product name: ");
        String name = sc.nextLine();

        System.out.print("\nenter the store where this product is bought: ");
        String store = sc.nextLine();

        System.out.print("\nenter product price: ");
        int price = sc.nextInt();

        return new Price(name, store, price);
    }

    @Override
    public int compareTo(Price o) {
        return this.store.compareTo(o.store);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
