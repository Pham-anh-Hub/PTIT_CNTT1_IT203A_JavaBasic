package PTIT_CNTT1_IT203A_Session09.Baitap5;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Baitap5_Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        Employee officeEmployee1 = new OfficeEmployee("Nguyen Van A", 12000000);
        Employee officeEmployee2 = new OfficeEmployee("Nguyen Thi B", 10000000);
        Employee productEmployee1 = new ProductionEmployee("Tran Van C", 15000000);
        Employee productEmployee2 = new ProductionEmployee("Nguyen Van D", 8000000);

        employees.add(officeEmployee1);
        employees.add(officeEmployee2);
        employees.add(productEmployee1);
        employees.add(productEmployee2);

        double totalSalary = 0;
        for (Employee e : employees){
            e.display();
            totalSalary += e.calculateSalary();
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Tổng lương nhân viên: " + nf.format(totalSalary));
    }
}
