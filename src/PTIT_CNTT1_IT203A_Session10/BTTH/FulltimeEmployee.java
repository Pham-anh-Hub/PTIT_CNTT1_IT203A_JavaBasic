package PTIT_CNTT1_IT203A_Session10.BTTH;

import java.text.NumberFormat;
import java.util.Scanner;

public class FulltimeEmployee extends Employee{
    double basicSalary;
    double bonus;

    public Scanner sc = new Scanner(System.in);

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String id, String name, int age, double basicSalary, double bonus) {
        super(id, name, age);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public void input() {
        super.input();
        System.out.print("Nhập lương cơ bản: ");
        setBasicSalary(sc.nextDouble());
        System.out.print("Nhập lương thưởng: ");
        setBonus(sc.nextDouble());
    }

    @Override
    public void display() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        super.display();
        System.out.println("Lương(kèm thưởng): " + nf.format(getSalary()) + " VND");
    }

    @Override
    public double getSalary() {
        return getBasicSalary() + getBonus();
    }
}
