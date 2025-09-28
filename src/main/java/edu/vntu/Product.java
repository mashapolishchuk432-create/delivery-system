package edu.vntu;

class Product {
    int id;
    String name;
    String category;
    double price;
    double weight;
    String size;
    int stock;
    String manufacturer;
    String expiryDate;
    double rating;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeStock(int quantity) {
        this.stock += quantity;
    }

    public void applyDiscount(double percent) {
        this.price -= this.price * (percent / 100);
    }

    public String getInfo() {
        return name + " - $" + price;
    }

    public void markAsUnavailable() {
        this.stock = 0;
    }

    @Override
    public String toString(){
      return "\nProduct Id " + id + 
      "\nName " + name + 
      "\nCategory "+ category +
      "\nPrice " + price + 
      "\nWeight " + weight +
      "\nSize " + size + 
      "\nStock " + stock + 
      "\nManufactuter " + manufacturer + 
      "\nExpiry date " + expiryDate + 
      "\nRating " + rating;
    }
}

