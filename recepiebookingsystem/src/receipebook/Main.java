package receipebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        appservice app = new appservice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Recipe Booking System ===");

        app.registerUser(101, "G_Deepak", "securePass123");
        app.registerUser(102, "Dhuyukshaa", "recipeLover99");

        System.out.println("\n--- Acting as User: G_Deepak ---");

        app.addingreceipe(101, "Tomato Pasta", "Classic Italian pasta with fresh basil.");
        app.addingreceipe(101, "Paneer Tikka", "Spicy grilled cottage cheese cubes.");

        System.out.println("\n--- Testing Search Feature ---");
        app.searchRecipe("Pasta");
        app.searchRecipe("Paneer Tikka");

        System.out.println("\n--- Testing Review System ---");
        app.addreview(102, "Amazing flavor! Very easy to follow.");

        app.displayuser();
        app.displayfoods();
        app.displayreview();
    }
}