
import java.util.*;

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
    List<Route> routes = new ArrayList<>(); // Додано список для маршрутів

    public DeliverySystem(String companyName, String version, String owner) {
        this.companyName = companyName;
        this.version = version;
        this.owner = owner;
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void addRoute(Route r) { // Додано метод для додавання маршруту
        routes.add(r);
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

