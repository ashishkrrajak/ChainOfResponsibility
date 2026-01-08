package management;

import enums.LeaveType;

public class Director extends Lead {
    @Override
    public boolean approveLeave(Integer leaveRequested, LeaveType typeOfLeave) {
        if (leaveRequested > 6 || typeOfLeave != LeaveType.SICK) {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Denied By Director");
            return false;
        } else {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Granted By Director");
            return true;
        }
    }
}
