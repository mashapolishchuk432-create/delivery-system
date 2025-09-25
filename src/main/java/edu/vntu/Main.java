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

        Product product = new Product(1, "Корм для котів", 1500.0);
        product.category = "Пет товари";
        product.weight = 2.5;
        product.size = "1 кг";
        product.stock = 10;
        product.manufacturer = "Whiskas";
        product.expiryDate = "2026-09-21";
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

        // Додаткові об’єкти
        Warehouse warehouse = new Warehouse(1, "Центральний склад", "Київ");
        warehouse.capacity = 1000;
        warehouse.currentStock = 500;
        warehouse.manager = "Олена Коваль";
        warehouse.contact = "+380991234567";
        warehouse.openTime = "9:00";
        warehouse.closeTime = "18:00";
        warehouse.status = "Відкритий";

        Courier courier = new Courier(1, "Петро Петренко");
        courier.phone = "+380661234567";
        courier.vehicle = "Авто";
        courier.rating = 4.8;
        courier.completedDeliveries = 50;
        courier.workingHours = "9:00-18:00";
        courier.status = "Доступний";
        courier.salary = 20000.0;

        Payment payment = new Payment(1, 1500.0);
        payment.order = order;
        payment.method = "Карта";
        payment.status = "Оплачено";
        payment.transactionId = "TX12345";
        payment.date = "2025-09-21";
        payment.currency = "UAH";
        payment.client = client;
        payment.receiptNumber = "RN123";

        Invoice invoice = new Invoice(1, order);
        invoice.client = client;
        invoice.date = "2025-09-21";
        invoice.total = 1500.0;
        invoice.tax = 300.0;
        invoice.discount = 100.0;
        invoice.paymentStatus = "Оплачено";
        invoice.pdfFile = "invoice1.pdf";
        invoice.dueDate = "2025-09-28";

        Vehicle vehicle = new Vehicle(1, "Toyota");
        vehicle.type = "Авто";
        vehicle.licensePlate = "AA1234BB";
        vehicle.capacity = 500;
        vehicle.fuelLevel = 80.0;
        vehicle.mileage = 10000;
        vehicle.status = "Доступний";
        vehicle.driver = "Петро Петренко";
        vehicle.lastServiceDate = "2025-08-01";

        Route route = new Route(1, "Київ, склад", "Київ, вул. Хрещатик, 1");
        route.distance = 10.5;
        route.estimatedTime = "30 хвилин";
        route.trafficStatus = "Нормальний";
        route.checkpoints = new String[]{"Пункт 1: Склад", "Пункт 2: Центр"};
        route.vehicle = vehicle;
        route.courier = courier;
        route.status = "Заплановано";

        // Створення нових об’єктів
        Supplier supplier = new Supplier(1, "Whiskas Supplier");
        supplier.products = new String[]{"Корм для котів", "Ласощі"};
        supplier.contact = "+380671234567";
        supplier.contractTerms = "Щомісячна поставка";
        supplier.rating = 4.7;
        supplier.deliveries = new String[]{"2025-09-15", "2025-09-20"};
        supplier.location = "Київ";
        supplier.paymentTerms = "Оплата після доставки";
        supplier.isActive = true;

        SupportTicket ticket = new SupportTicket(1, client);
        ticket.subject = "Проблема з доставкою корму";
        ticket.message = "Корм не доставлено вчасно.";
        ticket.status = "Open";
        ticket.priority = "Середній";
        ticket.createdAt = "2025-09-21";
        ticket.updatedAt = "2025-09-21";
        ticket.assignedTo = "Олена Коваль";
        ticket.resolution = "Очікує";

        Review review = new Review(1, client, product);
        review.rating = 4.5;
        review.comment = "Чудовий корм, коту сподобалось!";
        review.date = "2025-09-21";
        review.orderId = 101;
        review.courierRating = 4.8;
        review.isVerified = true;
        review.status = "Pending";

        Manager manager = new Manager(1, "Олена Коваль");
        manager.team = new String[]{"Петро Петренко", "Марія Сидоренко"};
        manager.department = "Логістика";
        manager.salary = 30000.0;
        manager.performance = "Відмінно";
        manager.reports = new String[]{"Звіт за вересень"};
        manager.meetings = new String[]{"Планування доставок"};
        manager.contact = "+380991234567";
        manager.status = "Активний";

        Employee employee = new Employee(1, "Марія Сидоренко");
        employee.role = "Оператор складу";
        employee.department = "Логістика";
        employee.salary = 15000.0;
        employee.hireDate = "2024-01-10";
        employee.contact = "+380931234567";
        employee.status = "Активний";
        employee.workingHours = "8:00-17:00";
        employee.performanceRating = 4.6;

        // Додати дані до системи
        system.clients.add(client);
        system.products.add(product);
        system.addOrder(order);
        system.warehouses.add(warehouse);
        system.couriers.add(courier);
        system.payments.add(payment);
        system.invoices.add(invoice);
        system.vehicles.add(vehicle);
        system.addRoute(route);
        system.addSupplier(supplier);
        system.addSupportTicket(ticket);
        system.addReview(review);
        system.addManager(manager);
        system.addEmployee(employee);

        // Запуск системи
        system.start();

        // Вивід інформації
        System.out.println("\n--- Client Info ---");
        System.out.println(client);

        System.out.println("\n--- Product Info ---");
        System.out.println(product);

        System.out.println("\n--- Order Info ---");
        System.out.println(order);

        System.out.println("\n--- Warehouse Info ---");
        System.out.println(warehouse);

        System.out.println("\n--- Courier Info ---");
        System.out.println(courier);

        System.out.println("\n--- Payment Info ---");
        System.out.println(payment);

        System.out.println("\n--- Invoice Info ---");
        System.out.println(invoice);

        System.out.println("\n--- Vehicle Info ---");
        System.out.println(vehicle);

        System.out.println("\n--- Route Info ---");
        System.out.println(route);

        System.out.println("\n--- Supplier Info ---");
        System.out.println(supplier);

        System.out.println("\n--- Support Ticket Info ---");
        System.out.println(ticket);

        System.out.println("\n--- Review Info ---");
        System.out.println(review);

        System.out.println("\n--- Manager Info ---");
        System.out.println(manager);

        System.out.println("\n--- Employee Info ---");
        System.out.println(employee);

        System.out.println("\n--- Demonstrating Methods ---");
        warehouse.storeProduct(product);
        warehouse.checkStock();
        courier.assignOrder(order);
        courier.completeDelivery();
        payment.process();
        invoice.generate();
        route.printRoute();
        route.calculateTime();
        route.addCheckpoint("Пункт 3: Офіс");
        route.optimize();
        route.updateStatus("В дорозі");
        supplier.deliverGoods();
        supplier.negotiatePrice();
        ticket.open();
        ticket.escalate();
        review.submit();
        review.approve();
        manager.assignTask("Організувати доставку");
        manager.holdMeeting();
        employee.clockIn();
        employee.requestVacation();

        system.generateReport();
        system.stop();

    }
}
