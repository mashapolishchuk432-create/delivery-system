class Courier {
    int id;
    String name;
    String phone;
    String vehicle;
    Order currentOrder;
    double rating;
    int completedDeliveries;
    String workingHours;
    String status;
    double salary;

    public Courier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignOrder(Order o) {
        this.currentOrder = o;
        System.out.println(name + " assigned to order " + o.id);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void completeDelivery() {
        completedDeliveries++;
        currentOrder = null;
        System.out.println(name + " completed a delivery.");
    }

    public void rateDelivery(double rate) {
        this.rating = (this.rating + rate) / 2;
    }

    public double calculateSalary() {
        return salary;
    }
}
