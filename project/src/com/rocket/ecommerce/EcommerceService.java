package com.rocket.ecommerce;
import java.util.*;

public class EcommerceService {
    private Map<Integer, Product> inventory = new HashMap<>();

    public void initData() {
        inventory.put(1, new Product(1, "Rocket Laptop", 1500.0));
        inventory.put(2, new Product(2, "Wireless Mouse", 50.0));
        inventory.put(3, new Product(3, "Mechanical KBD", 120.0));
    }

    public void showInventory() {
        System.out.println("\nAvailable Products:");
        inventory.values().forEach(System.out::println);
    }

    public Product getProduct(int id) {
        return inventory.get(id);
    }
}