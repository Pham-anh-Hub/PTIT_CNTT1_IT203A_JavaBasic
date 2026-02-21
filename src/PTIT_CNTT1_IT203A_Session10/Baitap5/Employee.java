package PTIT_CNTT1_IT203A_Session10.Baitap5;

public abstract class Employee {
    public String name;
    protected double baseSalary;

    public Employee() {
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public abstract void printInfo();

}
