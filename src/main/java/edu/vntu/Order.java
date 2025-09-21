package edu.vntu;

import java.util.List;

public class Order {
    int id;
    Client client;
    List<Product> productList;
    double totalPrice;
    String status;
    String address;
    String deliveryDate;
    String paymentMethod;
    String trackingNumber;
    String priority;

    public Order(int id, Client client, List<Product> productList) {
        this.id = id;
        this.client = client;
        this.productList = productList;
    }

    public double calculateTotal() {
        totalPrice = 0;
        for (Product p : productList) {
            totalPrice += p.price;
        }
        return totalPrice;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void removeProduct(Product p) {
        productList.remove(p);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void printInvoice() {
        System.out.println("Invoice for Order #" + id);
    }
}
