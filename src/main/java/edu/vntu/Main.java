// Клас Main для запуску
import java.util.*;
public class Main {
    public static void main(String[] args) {
        DeliverySystem system = new DeliverySystem("FastDelivery", "1.0", "DeliveryCorp");

        // Створення клієнта та продукту
        Client client = new Client(1, "Іван Іванов");
        client.email = "ivan@example.com";
        client.phone = "+380991234567";
        client.address = "Київ, вул. Хрещатик, 1";
        client.registrationDate = "2025-09-21";
        client.preferredPayment = "Карта";
        client.isActive = true;

        Product product = new Product(1, "Ноутбук", 1500.0);
        product.category = "Електроніка";
        product.weight = 2.5;
        product.size = "15 inches";
        product.stock = 10;
        product.manufacturer = "Dell";
        product.expiryDate = "N/A";
        product.rating = 4.5;

        // Створення замовлення
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order = new Order(101, client, productList);
        order.address = "Київ, вул. Хрещатик, 1";
        order.deliveryDate = "2025-09-25";
        order.paymentMethod = "Карта";
        order.trackingNumber = "TR12345";
        order.priority = "Високий";
        order.calculateTotal();
        order.updateStatus("В обробці");

        // Додати дані до системи
        system.clients.add(client);
        system.products.add(product);
        system.addOrder(order);

        // Додаткові об’єкти для демонстрації
        Warehouse warehouse = new Warehouse(1, "Центральний склад", "Київ");
        warehouse.capacity = 1000;
        warehouse.currentStock = 500;
        warehouse.manager = "Олена Коваль";
        warehouse.contact = "+380991234567";
        warehouse.openTime = "9:00";
        warehouse.closeTime = "18:00";
        warehouse.status = "Відкритий";
        system.warehouses.add(warehouse);

        Courier courier = new Courier(1, "Петро Петренко");
        courier.phone = "+380661234567";
        courier.vehicle = "Авто";
        courier.rating = 4.8;
        courier.completedDeliveries = 50;
        courier.workingHours = "9:00-18:00";
        courier.status = "Доступний";
        courier.salary = 20000.0;
        system.couriers.add(courier);

        Payment payment = new Payment(1, 1500.0);
        payment.order = order;
        payment.method = "Карта";
        payment.status = "Оплачено";
        payment.transactionId = "TX12345";
        payment.date = "2025-09-21";
        payment.currency = "UAH";
        payment.client = client;
        payment.receiptNumber = "RN123";
        system.payments.add(payment);

        Invoice invoice = new Invoice(1, order);
        invoice.client = client;
        invoice.date = "2025-09-21";
        invoice.total = 1500.0;
        invoice.tax = 300.0;
        invoice.discount = 100.0;
        invoice.paymentStatus = "Оплачено";
        invoice.pdfFile = "invoice1.pdf";
        invoice.dueDate = "2025-09-28";
        system.invoices.add(invoice);

        Vehicle vehicle = new Vehicle(1, "Toyota");
        vehicle.type = "Авто";
        vehicle.licensePlate = "AA1234BB";
        vehicle.capacity = 500;
        vehicle.fuelLevel = 80.0;
        vehicle.mileage = 10000;
        vehicle.status = "Доступний";
        vehicle.driver = "Петро Петренко";
        vehicle.lastServiceDate = "2025-08-01";
        system.vehicles.add(vehicle);

        // Запуск системи
        system.start();

        // Вивід інформації про клієнта
        System.out.println("\n--- Client Info ---");
        System.out.println("ID: " + client.id);
        System.out.println("Name: " + client.name);
        System.out.println("Email: " + client.email);
        System.out.println("Phone: " + client.phone);
        System.out.println("Address: " + client.address);
        System.out.println("Registration Date: " + client.registrationDate);
        System.out.println("Loyalty Points: " + client.loyaltyPoints);
        System.out.println("Preferred Payment: " + client.preferredPayment);
        System.out.println("Is Active: " + client.isActive);

        // Вивід інформації про продукт
        System.out.println("\n--- Product Info ---");
        System.out.println("ID: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("Category: " + product.category);
        System.out.println("Price: $" + product.price);
        System.out.println("Weight: " + product.weight);
        System.out.println("Size: " + product.size);
        System.out.println("Stock: " + product.stock);
        System.out.println("Manufacturer: " + product.manufacturer);
        System.out.println("Expiry Date: " + product.expiryDate);
        System.out.println("Rating: " + product.rating);

        // Вивід інформації про замовлення
        System.out.println("\n--- Order Info ---");
        System.out.println("ID: " + order.id);
        System.out.println("Client: " + order.client.name);
        System.out.println("Total Price: $" + order.totalPrice);
        System.out.println("Status: " + order.status);
        System.out.println("Address: " + order.address);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Payment Method: " + order.paymentMethod);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Priority: " + order.priority);

        // Вивід інформації про склад
        System.out.println("\n--- Warehouse Info ---");
        System.out.println("ID: " + warehouse.id);
        System.out.println("Name: " + warehouse.name);
        System.out.println("Location: " + warehouse.location);
        System.out.println("Capacity: " + warehouse.capacity);
        System.out.println("Current Stock: " + warehouse.currentStock);
        System.out.println("Manager: " + warehouse.manager);
        System.out.println("Contact: " + warehouse.contact);
        System.out.println("Open Time: " + warehouse.openTime);
        System.out.println("Close Time: " + warehouse.closeTime);
        System.out.println("Status: " + warehouse.status);

        // Вивід інформації про кур'єра
        System.out.println("\n--- Courier Info ---");
        System.out.println("ID: " + courier.id);
        System.out.println("Name: " + courier.name);
        System.out.println("Phone: " + courier.phone);
        System.out.println("Vehicle: " + courier.vehicle);
        System.out.println("Rating: " + courier.rating);
        System.out.println("Completed Deliveries: " + courier.completedDeliveries);
        System.out.println("Working Hours: " + courier.workingHours);
        System.out.println("Status: " + courier.status);
        System.out.println("Salary: " + courier.salary);

        // Вивід інформації про платіж
        System.out.println("\n--- Payment Info ---");
        System.out.println("ID: " + payment.id);
        System.out.println("Amount: $" + payment.amount);
        System.out.println("Method: " + payment.method);
        System.out.println("Status: " + payment.status);
        System.out.println("Transaction ID: " + payment.transactionId);
        System.out.println("Date: " + payment.date);
        System.out.println("Currency: " + payment.currency);
        System.out.println("Receipt Number: " + payment.receiptNumber);

        // Вивід інформації про рахунок
        System.out.println("\n--- Invoice Info ---");
        System.out.println("ID: " + invoice.id);
        System.out.println("Client: " + invoice.client.name);
        System.out.println("Date: " + invoice.date);
        System.out.println("Total: $" + invoice.total);
        System.out.println("Tax: " + invoice.tax);
        System.out.println("Discount: " + invoice.discount);
        System.out.println("Payment Status: " + invoice.paymentStatus);
        System.out.println("PDF File: " + invoice.pdfFile);
        System.out.println("Due Date: " + invoice.dueDate);

        // Вивід інформації про транспорт
        System.out.println("\n--- Vehicle Info ---");
        System.out.println("ID: " + vehicle.id);
        System.out.println("Type: " + vehicle.type);
        System.out.println("Model: " + vehicle.model);
        System.out.println("License Plate: " + vehicle.licensePlate);
        System.out.println("Capacity: " + vehicle.capacity);
        System.out.println("Fuel Level: " + vehicle.fuelLevel);
        System.out.println("Mileage: " + vehicle.mileage);
        System.out.println("Status: " + vehicle.status);
        System.out.println("Driver: " + vehicle.driver);
        System.out.println("Last Service Date: " + vehicle.lastServiceDate);

        // Демонстрація методів
        System.out.println("\n--- Demonstrating Methods ---");
        warehouse.storeProduct(product); // Product stored: Ноутбук
        warehouse.checkStock(); // Current stock: 500
        courier.assignOrder(order); // Петро Петренко assigned to order 101
        courier.completeDelivery(); // Петро Петренко completed a delivery.
        payment.process(); // Status: Processed
        invoice.generate(); // Invoice generated.

        // Звіт
        system.generateReport();

        // Завершення
        system.stop();
    }
}
