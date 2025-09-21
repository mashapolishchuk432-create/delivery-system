package edu.vntu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the delivery system
        DeliverySystem system = new DeliverySystem("QuickShip", "1.0", "FastDelivery Inc.");

        // Start the system
        system.start();

        // Create a sample order and add it
        Order order = new Order(123, new Client(1, "John Doe"), List.of(new Product(12, "Laptop", 800)));
        system.addOrder(order);

        // Generate a report
        system.generateReport();

        // Cancel the order
        system.cancelOrder(order);

        // Stop the system
        system.stop();
    }
}
