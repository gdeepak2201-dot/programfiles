package com.rocket.ecommerce;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EcommerceService service = new EcommerceService();
        service.initData();

        System.out.println("=== Rocket India Mini E-Com Project ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Customer customer = new Customer(101, name, name.toLowerCase() + "@mail.com");
        customer.displayRolePermissions();

        List<Product> cart = new ArrayList<>();
        boolean shopping = true;

        while (shopping) {
            service.showInventory();
            System.out.print("\nEnter Product ID to add to cart (or 0 to checkout): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                shopping = false;
            } else {
                Product p = service.getProduct(choice);
                if (p != null) {
                    cart.add(p);
                    System.out.println("Added " + p.getName() + " to cart.");
                } else {
                    System.out.println("Invalid ID!");
                }
            }
        }

        if (!cart.isEmpty()) {
            Order myOrder = new Order(cart);
            customer.addOrder(myOrder);
            myOrder.showOrderDetails();
            System.out.println("Thank you for shopping at Rocket India!");
        }

        sc.close();
    }
}