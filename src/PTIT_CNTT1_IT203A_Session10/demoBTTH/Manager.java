package PTIT_CNTT1_IT203A_Session10.demoBTTH;

public class Manager extends Employee{
    public double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus/100;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + baseSalary * getBonus()/100;
    }



}
