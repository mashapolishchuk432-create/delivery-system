public class Main {
    public static void main(String[] args) {
        DeliverySystem system = new DeliverySystem("FastDelivery", "1.0", "DeliveryCorp");

        // Створення клієнта та продукту
        Client client = new Client(1, "Іван Іванов");
        Product product = new Product(1, "Ноутбук", 1500.0);

        // Створення замовлення
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order = new Order(101, client, productList);
        order.calculateTotal();

        // Додати дані до системи
        system.clients.add(client);
        system.products.add(product);
        system.addOrder(order);

        // Запуск системи
        system.start();

        // Вивід інформації
        System.out.println("\n--- Delivery System Info ---");
        System.out.println("Company: " + system.companyName);
        System.out.println("Version: " + system.version);
        System.out.println("Client: " + client.name);
        System.out.println("Ordered Product: " + product.getInfo());
        System.out.println("Total Order Price: $" + order.totalPrice);

        // Звіт
        system.generateReport();

        // Завершення
        system.stop();
    }
}