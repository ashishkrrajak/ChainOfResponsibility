package management;


import enums.LeaveType;

public class Manager extends Lead {
    @Override
    public boolean approveLeave(Integer leaveRequested, LeaveType typeOfLeave) {
        if (leaveRequested <= 5  && (typeOfLeave == LeaveType.SICK || typeOfLeave == LeaveType.EARNED)) {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Granted By Manager");
            return true;
        } else if (leaveRequested > 5 && getLead() != null){
            return this.getLead().approveLeave(leaveRequested, typeOfLeave);
        } else {
            System.out.println(">>>>>>>> Leave Request "+ typeOfLeave+ " Denied By Manager");
            return false;
        }
    }

}
