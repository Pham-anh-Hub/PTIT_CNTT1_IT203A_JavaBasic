package PTIT_CNTT1_IT203A_Session09.Baitap5;

import java.text.NumberFormat;

public class Employee {
    public String fullname;
    public double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public void display(){
        System.out.println("\nHọ tên: " + this.fullname);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Lương cơ bản: " + nf.format(this.calculateSalary()));
    }

    public double calculateSalary(){
        return this.salary;
    }

}
