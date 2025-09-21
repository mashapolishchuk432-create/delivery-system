package edu.vntu;

public class Review {
    int id;
    Client client;
    Product product;
    double rating;
    String comment;
    String date;
    int orderId;
    double courierRating;
    boolean isVerified;
    String status;

    public Review(int id, Client client, Product product) {
        this.id = id;
        this.client = client;
        this.product = product;
    }

    public void submit() {
        System.out.println("Review submitted.");
    }

    public void edit(String comment) {
        this.comment = comment;
    }

    public void delete() {
        System.out.println("Review deleted.");
    }

    public void approve() {
        status = "Approved";
    }

    public void reject() {
        status = "Rejected";
    }
}