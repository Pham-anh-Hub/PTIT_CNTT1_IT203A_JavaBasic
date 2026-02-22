package PTIT_CNTT1_IT203A_Session10.BTTH;

import java.text.NumberFormat;
import java.util.Scanner;

public class ParttimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public Scanner sc = new Scanner(System.in);

    public int getWorkingHours() { return workingHours; }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String id, String name, int age, double hourlyRate, int workingHours) {
        super(id, name, age);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập sô giờ làm việc: ");
        setWorkingHours(sc.nextInt());
        System.out.print("Nhập công làm: ");
        setHourlyRate(sc.nextDouble());
    }

    @Override
    public void display() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        super.display();
        System.out.println("Lương: " + nf.format(getSalary()) + " VND");
    }

    @Override
    public double getSalary() {
        return getWorkingHours() * getHourlyRate();
    }


}
