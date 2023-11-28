import Emp.Manager;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setEmployeeDetails(1, "Jhon", 45, 45000, 12, "HR");
        mgr.getEmployeeDetails();
        mgr.hire();
        mgr.fire();
        mgr.hire();
        mgr.setManager("Kevin");
    }
}