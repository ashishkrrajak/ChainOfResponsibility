package management;

import enums.LeaveType;

public abstract class Lead {
    private Lead rh;
    Lead(){
        this.rh = null;
    }
    public void setLead(Lead lead) {
        rh = lead;
    }
    public final Lead getLead() {
        return rh;
    }
    public abstract boolean approveLeave(Integer leaveRequested, LeaveType typeOfLeave);
}
