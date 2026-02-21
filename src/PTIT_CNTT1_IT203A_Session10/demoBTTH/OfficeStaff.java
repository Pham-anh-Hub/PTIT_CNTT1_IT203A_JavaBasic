package PTIT_CNTT1_IT203A_Session10.demoBTTH;

import java.text.NumberFormat;

public class OfficeStaff extends Employee{

    public OfficeStaff() {
        super();
    }


    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary;
    }
}
