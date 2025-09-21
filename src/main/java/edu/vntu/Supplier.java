package edu.vntu;

public class Supplier {
    int id;
    String name;
    String[] products;
    String contact;
    String contractTerms;
    double rating;
    String[] deliveries;
    String location;
    String paymentTerms;
    boolean isActive;

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void deliverGoods() {
        System.out.println("Goods delivered.");
    }

    public void negotiatePrice() {
        System.out.println("Negotiation started.");
    }

    public void updateContract(String terms) {
        contractTerms = terms;
    }

    public void pauseSupply() {
        isActive = false;
    }

    public void resumeSupply() {
        isActive = true;
    }
}