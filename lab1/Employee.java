public class Employee {
    private int emp_no;
    private String name;
    private int age;
    private int dept_no;
    private String dept;
    private double salary;

    public Employee() {
        this.emp_no = 0;
        this.name = "";
        this.age = 0;
        this.dept_no = 0;
        this.dept = "";
        this.salary = 0.0;
    }

    public Employee(int emp_no, String name, double salary) {
        this.emp_no = emp_no;
        this.name = name;
        this.age = 0;
        this.dept_no = 0;
        this.dept = "NA";
        this.salary = salary;
    }

    public Employee(int emp_no, String name, int age, int dept_no, String dept, double salary) {
        this.emp_no = emp_no;
        this.name = name;
        this.age = age;
        this.dept_no = dept_no;
        this.dept = dept;
        this.salary = salary;
    }

    public void editDetails(int emp_no) {
        this.emp_no = emp_no;
    }

    public void editDetails(String name) {
        this.name = name;
    }

    public void editDetails(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("**************************");
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Number: " + this.emp_no);
        System.out.println("Age: " + this.age);
        System.out.println("Department Number: " + this.dept_no);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + this.salary);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(20, "Jake", 24, 5, "HR", 45000);

        e1.displayDetails();
        e1.editDetails("Bob");
        e1.editDetails(23);
        e1.editDetails(45000);
        e1.displayDetails();
    }
}
