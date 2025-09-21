class Route {
    int id;
    String startLocation;
    String endLocation;
    double distance;
    String estimatedTime;
    String trafficStatus;
    String[] checkpoints;
    Vehicle vehicle;
    Courier courier;
    String status;

    public Route(int id, String startLocation, String endLocation) {
        this.id = id;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public void calculateTime() {
        System.out.println("Estimated time: " + estimatedTime);
    }

    public void optimize() {
        System.out.println("Route optimized.");
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void addCheckpoint(String checkpoint) {
        System.out.println("Checkpoint added: " + checkpoint);
    }

    public void printRoute() {
        System.out.println("Route from " + startLocation + " to " + endLocation);
    }
}

