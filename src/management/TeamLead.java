package management;

import enums.LeaveType;

public class TeamLead extends Lead{
    @Override
    public boolean approveLeave(Integer leaveRequested, LeaveType typeOfLeave) {
        if (leaveRequested <= 2 ) {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Granted By Team Lead");
            return true;
        } else if (getLead()!= null){
            return this.getLead().approveLeave(leaveRequested, typeOfLeave);
        } else {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Denied By Team Lead");
            return false;
        }
    }
}
