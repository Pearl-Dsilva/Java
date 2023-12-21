public class Main {
    public static void main(String[] args) {
        GenericBox<Employee> genericBox = new GenericBox<>();
        genericBox.set(new Employee("Jake", 1000.0, 40));
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printEmployeeDetails(genericBox);
    }
}
