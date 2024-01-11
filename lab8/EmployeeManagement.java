import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating a HashMap of employee IDs and employee objects
        HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for employee " + i + ":");
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();

            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            employeeMap.put(i, new Employee(name, age, salary));
            scanner.nextLine();
        }

        // Printing the contents of the HashMap
        System.out.println("Employee Map: " + employeeMap);

        TreeMap<String, String> departmentMap = new TreeMap<String, String>();
        departmentMap.put("IT", "Information Technology");
        departmentMap.put("HR", "Human Resources");
        departmentMap.put("FIN", "Finance");

        // Printing the contents of the TreeMap
        System.out.println("Department Map: " + departmentMap);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 3, 25));
        employees.add(new Employee("Alex", 1, 30));
        employees.add(new Employee("Bob", 2, 28));

        int maxAge = Collections.max(employees, (e1, e2) -> e1.getAge() - e2.getAge()).getAge();
        int minAge = Collections.min(employees, (e1, e2) -> e1.getAge() - e2.getAge()).getAge();

        System.out.println("Maximum age: " + maxAge);
        System.out.println("Minimum age: " + minAge);
        scanner.close();
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary2) {
        this.name = name;
        this.age = age;
        this.salary = salary2;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
