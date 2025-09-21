package edu.vntu;

public class Employee {
    int id;
    String name;
    String role;
    String department;
    double salary;
    String hireDate;
    String contact;
    String status;
    String workingHours;
    double performanceRating;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void clockIn() {
        System.out.println(name + " clocked in.");
    }

    public void clockOut() {
        System.out.println(name + " clocked out.");
    }

    public void updateInfo(String contact) {
        this.contact = contact;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void requestVacation() {
        System.out.println(name + " requested vacation.");
    }
}