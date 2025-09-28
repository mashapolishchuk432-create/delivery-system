package edu.vntu;


import java.util.ArrayList;
import java.util.List;

class DeliverySystem {
    String companyName;
    String version;
    String owner;
    List<Client> clients = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();
    List<Warehouse> warehouses = new ArrayList<>();
    List<Courier> couriers = new ArrayList<>();
    List<Payment> payments = new ArrayList<>();
    List<Invoice> invoices = new ArrayList<>();
    List<Vehicle> vehicles = new ArrayList<>();
    List<Route> routes = new ArrayList<>();
    List<Supplier> suppliers = new ArrayList<>(); // Додано для постачальників
    List<SupportTicket> supportTickets = new ArrayList<>(); // Додано для тікетів
    List<Review> reviews = new ArrayList<>(); // Додано для відгуків
    List<Manager> managers = new ArrayList<>(); // Додано для менеджерів
    List<Employee> employees = new ArrayList<>(); // Додано для співробітників

    public DeliverySystem(String companyName, String version, String owner) {
        this.companyName = companyName;
        this.version = version;
        this.owner = owner;
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void addRoute(Route r) {
        routes.add(r);
    }

    public void addSupplier(Supplier s) {
        suppliers.add(s);
    }

    public void addSupportTicket(SupportTicket t) {
        supportTickets.add(t);
    }

    public void addReview(Review r) {
        reviews.add(r);
    }

    public void addManager(Manager m) {
        managers.add(m);
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void start() {
        System.out.println("System started.");
    }

    public void stop() {
        System.out.println("System stopped.");
    }

    public void generateReport() {
        System.out.println("Generating report...");
    }
}

