using System;

public class SupportTicket
{
    public int Id { get; set; }
    public Client Client { get; set; }
    public string Subject { get; set; }
    public string Message { get; set; }
    public string Status { get; set; }
    public string Priority { get; set; }
    public string CreatedAt { get; set; }
    public string UpdatedAt { get; set; }
    public string AssignedTo { get; set; }
    public string Resolution { get; set; }

    public SupportTicket(int id, Client client)
    {
        Id = id;
        Client = client;
    }

    public void Open()
    {
        Status = "Open";
    }

    public void Close()
    {
        Status = "Closed";
    }

    public void Escalate()
    {
        Priority = "High";
    }

    public void UpdateMessage(string msg)
    {
        Message = msg;
    }

    public void AssignToAgent(string agent)
    {
        AssignedTo = agent;
    }
}

public class Employee
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Role { get; set; }
    public string Department { get; set; }
    public double Salary { get; set; }
    public string HireDate { get; set; }
    public string Contact { get; set; }
    public string Status { get; set; }
    public string WorkingHours { get; set; }
    public double PerformanceRating { get; set; }

    public Employee(int id, string name)
    {
        Id = id;
        Name = name;
    }

    public void ClockIn()
    {
        Console.WriteLine($"{Name} clocked in.");
    }

    public void ClockOut()
    {
        Console.WriteLine($"{Name} clocked out.");
    }

    public void UpdateInfo(string contact)
    {
        Contact = contact;
    }

    public double CalculateBonus()
    {
        return Salary * 0.1;
    }

    public void RequestVacation()
    {
        Console.WriteLine($"{Name} requested vacation.");
    }
}

public class Manager
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string[] Team { get; set; }
    public string Department { get; set; }
    public double Salary { get; set; }
    public string Performance { get; set; }
    public string[] Reports { get; set; }
    public string[] Meetings { get; set; }
    public string Contact { get; set; }
    public string Status { get; set; }

    public Manager(int id, string name)
    {
        Id = id;
        Name = name;
    }

    public void AssignTask(string task)
    {
        Console.WriteLine("Assigned task: " + task);
    }

    public void ReviewReport(string report)
    {
        Console.WriteLine("Reviewing: " + report);
    }

    public void HoldMeeting()
    {
        Console.WriteLine("Meeting held.");
    }

    public void ApproveBudget()
    {
        Console.WriteLine("Budget approved.");
    }

    public void FireEmployee(string empName)
    {
        Console.WriteLine(empName + " has been fired.");
    }
}

public class SupportTicket
{
    public int Id { get; set; }
    public Client Client { get; set; }
    public string Subject { get; set; }
    public string Message { get; set; }
    public string Status { get; set; }
    public string Priority { get; set; }
    public string CreatedAt { get; set; }
    public string UpdatedAt { get; set; }
    public string AssignedTo { get; set; }
    public string Resolution { get; set; }

    public SupportTicket(int id, Client client)
    {
        Id = id;
        Client = client;
    }

    public void Open()
    {
        Status = "Open";
    }

    public void Close()
    {
        Status = "Closed";
    }

    public void Escalate()
    {
        Priority = "High";
    }

    public void UpdateMessage(string msg)
    {
        Message = msg;
    }

    public void AssignToAgent(string agent)
    {
        AssignedTo = agent;
    }
}
namespace ЛАба
{
    public class Class1
    {

    }
}
