public class Employee {
    // Static variable to keep track of the last assigned ID
    private static int nextId = 1;

    // Instance variables for each employee
    private int id;
    private String name;

    // Constructor for Employee class
    public Employee(String name) {
        this.name = name;
        this.id = nextId; // Assign the next available ID
        nextId++; // Increment the ID for the next employee
    }

    // Method to get the employee's ID
    public int getId() {
        return id;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ayan");
        Employee emp2 = new Employee("Ganesh");
        Employee emp3 = new Employee("Mahesh");

        System.out.println(emp1.getName() + "'s ID: " + emp1.getId());
        System.out.println(emp2.getName() + "'s ID: " + emp2.getId());
        System.out.println(emp3.getName() + "'s ID: " + emp3.getId());
    }
}
