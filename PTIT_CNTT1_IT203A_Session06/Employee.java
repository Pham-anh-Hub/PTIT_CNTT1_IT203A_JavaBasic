package PTIT_CNTT1_IT203A_Session06;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    protected String employeeId;
    public String name;
    protected double salary;

    public Employee() {
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Phương thức hiển thị thôgn tin nhân viên
    public void showEmployeeInfo(){
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(this.employeeId + " | " + this.name + " | " + nf.format(this.salary) + "VND" + "\n");
    }
}
