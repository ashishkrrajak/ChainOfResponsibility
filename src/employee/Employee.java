package employee;

import enums.LeaveType;
import management.Lead;

public abstract class Employee {
    Lead rh;
    Employee() {
        this.rh = null;
    }
    public abstract void setRH(Lead rh);

    public abstract Lead getRH();

    public final boolean applyLeave(Integer leaveRequested, LeaveType  typeOfLeave) {
        if (rh == null) {
            System.out.println("Employee Must Have Reporting Head to apply Leave");
            return false;
        }
        return rh.approveLeave(leaveRequested,typeOfLeave);
    }

}
