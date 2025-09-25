

class Vehicle {
    int id;
    String type;
    String model;
    String licensePlate;
    int capacity;
    double fuelLevel;
    int mileage;
    String status;
    String driver;
    String lastServiceDate;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle " + licensePlate + " started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void refuel() {
        fuelLevel = 100;
    }

    public void scheduleService() {
        System.out.println("Service scheduled.");
    }

    public void updateMileage(int km) {
        mileage += km;
    }

    @Override
    public String toString(){
        return "\nVehicle id " + id + 
        "\nType " + type +
        "\nModel " + model + 
        "\nLicense Plate " +licensePlate + 
        "\nCapacity " + capacity + 
        "\nFuel Level " + fuelLevel + 
        "\nMileage " + mileage + 
        "\nStaus " + status + 
        "\nDriver " + driver + 
        "\nLast service date " + lastServiceDate;
    }

}

