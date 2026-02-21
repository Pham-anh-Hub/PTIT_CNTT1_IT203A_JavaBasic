package PTIT_CNTT1_IT203A_Session10.demoBTTH;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Employee officeStaff1 = new OfficeStaff("Nguyen Van A", 12000000);
        Employee officeStaff2 = new OfficeStaff("Nguyen Thi B", 15000000);

        Employee manager = new Manager("Tran Van C", 20000000, 15);

        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("officeStaff1:    " + nf.format(officeStaff1.calculateSalary()));
        System.out.println("officeStaff2:    " + nf.format(officeStaff2.calculateSalary()));

        System.out.println("Manager:    " + nf.format(manager.calculateSalary()));

    }

}
