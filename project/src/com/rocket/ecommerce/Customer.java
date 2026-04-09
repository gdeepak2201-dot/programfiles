package com.rocket.ecommerce;
import java.util.*;

public class Customer extends User {
    private int custId;
    private List<Order> orderHistory;

    public Customer(int id, String name, String email) {
        super(name, email);
        this.custId = id;
        this.orderHistory = new ArrayList<>();
    }

    @Override
    public void displayRolePermissions() {
        System.out.println("Role: Customer | Permissions: Browse, Buy, Track.");
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}