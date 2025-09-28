package edu.vntu;


class Payment {
    int id;
    Order order;
    double amount;
    String method;
    String status;
    String transactionId;
    String date;
    String currency;
    Client client;
    String receiptNumber;

    public Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void process() {
        status = "Processed";
    }

    public void refund() {
        status = "Refunded";
    }

    public void confirm() {
        status = "Confirmed";
    }

    public void cancel() {
        status = "Cancelled";
    }

    public void generateReceipt() {
        System.out.println("Receipt: " + receiptNumber);
    }

    @Override
    public String toString() {
        return "\nPayment id " + id +
        "\nAmount " + amount + 
        "\nMethod " + method + 
        "\nStatus " + status + 
        "\nTransaction ID " + transactionId + 
        "\nDate " + date + 
        "\nCurrency " + currency +
        "\nReceipt number " + receiptNumber;
    }

}
