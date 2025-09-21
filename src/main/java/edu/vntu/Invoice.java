package edu.vntu;

public class Invoice {
    int id;
    Order order;
    Client client;
    String date;
    double total;
    double tax;
    double discount;
    String paymentStatus;
    String pdfFile;
    String dueDate;

    public Invoice(int id, Order order) {
        this.id = id;
        this.order = order;
    }

    public void generate() {
        System.out.println("Invoice generated.");
    }

    public void sendToClient() {
        System.out.println("Invoice sent to " + client.name);
    }

    public void markPaid() {
        paymentStatus = "Paid";
    }

    public void markUnpaid() {
        paymentStatus = "Unpaid";
    }

    public void print() {
        System.out.println("Printing invoice...");
    }
}

