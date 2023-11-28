package Emp;

public class Manager implements Employee, Engineer {
    private int employeeId;
    private String empName;
    private int age;
    private int salary;
    private int deptId;
    private String deptName;
    private boolean isHired;

    @Override
    public void setEmployeeDetails(int employeeId, String empName, int age, int salary, int deptId, String deptName) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public void getEmployeeDetails() {
        isHired = true;
        System.out.println("Name: " + empName + "\nEmployee Id: " + employeeId + "\nAge: " + age + "\nSalary: " + salary
                + "\nDepartment Id: " + deptId + "\nDepartment name: " + deptName);
    }

    @Override
    public void hire() {
        if (isHired)
            System.out.println("Employee is hired!");
        else
            System.out.println("Employee is not hired.");
    }

    @Override
    public void fire() {
        if (isHired) {
            isHired = false;
            System.out.println("Employee is fired");
        } else
            System.out.println("Employee does not exist.");
    }

    @Override
    public void setManager(String empName) {
        System.out.println("Manager: " + empName);
    }

}
