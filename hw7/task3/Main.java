package hw7.task3;

import java.util.*;

public class Main {
    static void main() {
        ArrayList<Price> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.format("====== Product %d ======", i + 1);
            products.add(Price.addProduct());
        }
        Collections.sort(products);

        ArrayList<Price> prodInShop = new ArrayList<>();

        while (true) {
            System.out.println("\nenter store to see its products: ");
            try {
                String userStore = sc.nextLine();
                prodInShop.clear();

                for (Price p : products) {
                    if (p.store.equals(userStore)) {
                        prodInShop.add(p);
                    }
                }

                if (prodInShop.isEmpty()) {
                    throw new Exception("no products found in this store");
                }

                System.out.println(prodInShop);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
