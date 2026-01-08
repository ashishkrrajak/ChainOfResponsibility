package management;

public abstract class ILead {
    ILead rh;
    ILead(){
        rh = null;
    }
    void setLead(ILead lead) {
        rh = lead;
    }
    abstract boolean approveLeave(Integer leaveRequested);
}
