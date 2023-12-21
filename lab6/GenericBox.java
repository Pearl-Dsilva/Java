public class GenericBox<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

interface GenericInterface<T> {
    T performAction(T t);
}

class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", Salary: " + calculateSalary();
    }
}

class GenericMethod {
    public <T> void printEmployeeDetails(GenericBox<T> genericBox) {
        System.out.println(genericBox.get().toString());
    }
}
