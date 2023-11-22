/*Implement the concept of inheritance, super, abstract and final keywords in your domain */
abstract class Employees {
    private final String empName;
    private final int empID;
    private String phone;
    private String email;
    private double salary;
    private String dept;

    public Employees(String empName, int empID, String phone, String email, double salary, String dept) {
        this.empName = empName;
        this.empID = empID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.dept = dept;
    }

    void displayName() {
        System.out.println("Employee Name: " + empName);
    }

    void salary() {
        System.out.println("Salary of Employee, " + empName + " is " + salary);
    }

    void details() {
        System.out.println("Employee ID: " + empID + "\nEmployee Name: " + empName + "\nPhone: " + phone + "\nEmail: "
                + email + "\nDepartmet : " + dept + "\nSalary: " + salary);
    }

}

class HR_Employees extends Employees {
    public HR_Employees(String empName, int empID, String phone, String email,
            double salary, String dept) {
        super(empName, empID, phone, email, salary, dept);
        super.displayName();
    }

    public static void main(String[] args) {
        HR_Employees emp1 = new HR_Employees("Jhon", 245, "9087798667",
                "jhon@test.com", 50000, "HR");
        emp1.displayName();
        emp1.details();
    }
}
