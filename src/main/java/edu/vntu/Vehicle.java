package edu.vntu;

public class Vehicle {
    int id;
    String type;
    String model;
    String licensePlate;
    int capacity;
    double fuelLevel;
    int mileage;
    String status;
    String driver;
    String lastServiceDate;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle " + licensePlate + " started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void refuel() {
        fuelLevel = 100;
    }

    public void scheduleService() {
        System.out.println("Service scheduled.");
    }

    public void updateMileage(int km) {
        mileage += km;
    }
}
