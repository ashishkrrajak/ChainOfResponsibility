import employee.Employee;
import employee.SoftwareEngineer;
import enums.LeaveType;
import management.Director;
import management.Lead;
import management.Manager;
import management.TeamLead;


public class Main {
    public static void main(String[] args) {
        Employee employeeA = new SoftwareEngineer();
        Lead director = new Director();
        Lead manager = new Manager();
        Lead teamLead = new TeamLead();
        teamLead.setLead(manager);
        manager.setLead(director);
        employeeA.setRH(teamLead);

        System.out.println("Leave request For up to 2 days");
        employeeA.applyLeave(2, LeaveType.CASUAL);
        employeeA.applyLeave(2, LeaveType.SICK);
        employeeA.applyLeave(2, LeaveType.EARNED);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Leave request For up to  5 days");
        employeeA.applyLeave(5, LeaveType.CASUAL);
        employeeA.applyLeave(5, LeaveType.SICK);
        employeeA.applyLeave(5, LeaveType.EARNED);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Leave request For 6 days");
        employeeA.applyLeave(6, LeaveType.CASUAL);
        employeeA.applyLeave(6, LeaveType.SICK);
        employeeA.applyLeave(6, LeaveType.EARNED);
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Leave request for greater than 6 days");
        employeeA.applyLeave(7, LeaveType.CASUAL);
        employeeA.applyLeave(7, LeaveType.SICK);
        employeeA.applyLeave(7, LeaveType.EARNED);

    }
}