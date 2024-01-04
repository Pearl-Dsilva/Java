import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    // constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // method to return name
    public String getName() {
        return name;
    }

    // method to return salary
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name +
                " (salary = " + salary +
                ")";
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        // Arraylist to take multiple values
        List<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        // Input the values
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of employee " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter the salary of employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employees.add(new Employee(name, salary));
        }

        scanner.close();
        // Get salary using getSalary, compare the double values and sort them
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Employees are (Sorted by Salary): ");
        // Display all the values sorted by salary
        employees.forEach(System.out::println);
    }
}
