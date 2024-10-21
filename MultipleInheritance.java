interface Identifiable {
    String getId();
}

interface Nameable {
    String getName();
}

class Employee implements Identifiable, Nameable {
    private String employeeId;
    private String employeeName;

    public Employee(String id, String name) {
        employeeId = id;
        employeeName = name;
    }

    public String getId() {
        return employeeId;
    }

    public String getName() {
        return employeeName;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Name: " + getName());
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("E123", "Vikrant");
        employee.displayDetails();
    }
}
