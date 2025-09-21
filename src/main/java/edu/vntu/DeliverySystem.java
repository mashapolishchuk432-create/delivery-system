package edu.vntu;

import java.util.*;


public class DeliverySystem {
    String name;
    String version;
    String companyName;
    List<Warehouse> warehouses;
    List<Courier> couriers;
    List<Client> clients;
    List<Product> products;
    List<Order> orders;
    List<Payment> payments;
    List<String> supportContacts;

    public DeliverySystem(String name, String version, String companyName) {
        this.name = name;
        this.version = version;
        this.companyName = companyName;
        this.warehouses = new ArrayList<>();
        this.couriers = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.supportContacts = new ArrayList<>();
    }

    public void start() {
        System.out.println("Delivery System Started.");
    }

    public void stop() {
        System.out.println("Delivery System Stopped.");
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added: " + order.id);
    }

    public void cancelOrder(Order order) {
        orders.remove(order);
        System.out.println("Order canceled: " + order.id);
    }

    public void generateReport() {
        System.out.println("=== Delivery System Report ===");
        System.out.println("Company: " + companyName);
        System.out.println("Version: " + version);
        System.out.println("Total Orders: " + orders.size());
        System.out.println("Total Products: " + products.size());
        System.out.println("Total Clients: " + clients.size());
    }
}