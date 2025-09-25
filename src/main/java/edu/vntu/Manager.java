public class Manager {
    int id;
    String name;
    String[] team;
    String department;
    double salary;
    String performance;
    String[] reports;
    String[] meetings;
    String contact;
    String status;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignTask(String task) {
        System.out.println("Assigned task: " + task);
    }

    public void reviewReport(String report) {
        System.out.println("Reviewing: " + report);
    }

    public void holdMeeting() {
        System.out.println("Meeting held.");
    }

    public void approveBudget() {
        System.out.println("Budget approved.");
    }

    public void fireEmployee(String empName) {
        System.out.println(empName + " has been fired.");
    }

@Override
public String toString() {
    return "\nManager id " + id + 
    "\nName " + name + 
    "\nTeam " + String.join(", ", team) + 
    "\nDeparment " + department + 
    "\nSalary "  + salary + 
    "\nPerformance " + performance + 
    "\nReports " +String.join(",", reports) + 
    "\nMeetings " + String.join(",", meetings) + 
    "\nContacts " + contact +
    "\nStatus " + status; 
}

}
