public class Warehouse {
    int id;
    String name;
    String location;
    int capacity;
    int currentStock;
    String manager;
    String contact;
    String openTime;
    String closeTime;
    String status;

    public Warehouse(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void storeProduct(Product p) {
        System.out.println("Product stored: " + p.name);
    }

    public void shipProduct(Product p) {
        System.out.println("Product shipped: " + p.name);
    }

    public void checkStock() {
        System.out.println("Current stock: " + currentStock);
    }

    public void restock() {
        System.out.println("Restocking...");
    }

    public void generateInventoryReport() {
        System.out.println("Inventory Report for Warehouse " + name);
    }
}