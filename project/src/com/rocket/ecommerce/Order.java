package com.rocket.ecommerce;
import java.util.*;

public class Order {
    private String orderId;
    private List<Product> items;
    private double totalAmount;

    public Order(List<Product> items) {
        this.orderId = "ORD-" + UUID.randomUUID().toString().substring(0, 8);
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void showOrderDetails() {
        System.out.println("\n--- Order Summary ---");
        System.out.println("Order ID: " + orderId);
        items.forEach(i -> System.out.println("- " + i.getName()));
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("----------------------");
    }
}