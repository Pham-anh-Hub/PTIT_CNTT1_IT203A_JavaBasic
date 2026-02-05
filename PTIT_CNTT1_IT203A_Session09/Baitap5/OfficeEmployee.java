package PTIT_CNTT1_IT203A_Session09.Baitap5;

public class OfficeEmployee extends Employee {

    public OfficeEmployee(String fullname, double salary) {
        super(fullname, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary * 100/100;
    }
}
