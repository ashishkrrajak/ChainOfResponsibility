package employee;

import management.Lead;

public class SoftwareEngineer extends Employee{


    @Override
    public void setRH(Lead rh) {
        this.rh = rh;
    }

    @Override
    public Lead getRH() {
        return this.rh;
    }

}
