package Emp;

public interface Employee {

    public void setEmployeeDetails(int empId, String empName, int age, int salary, int deptId, String deptName);

    public void getEmployeeDetails();

    public void hire();

    public void fire();

}