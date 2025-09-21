public class SupportTicket {
    int id;
    Client client;
    String subject;
    String message;
    String status;
    String priority;
    String createdAt;
    String updatedAt;
    String assignedTo;
    String resolution;

    public SupportTicket(int id, Client client) {
        this.id = id;
        this.client = client;
    }

    public void open() {
        status = "Open";
    }

    public void close() {
        status = "Closed";
    }

    public void escalate() {
        priority = "High";
    }

    public void updateMessage(String msg) {
        this.message = msg;
    }

    public void assignToAgent(String agent) {
        this.assignedTo = agent;
    }
}