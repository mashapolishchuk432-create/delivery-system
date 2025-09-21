import java.util.*;

class Client {
    int id;
    String name;
    String email;
    String phone;
    String address;
    String registrationDate;
    List<Order> orders;
    int loyaltyPoints;
    String preferredPayment;
    boolean isActive;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order " + o.id);
    }

    public void cancelOrder(Order o) {
        orders.remove(o);
    }

    public void updateInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public void earnPoints(int points) {
        loyaltyPoints += points;
    }

    public void contactSupport() {
        System.out.println("Client contacted support.");
    }
}
