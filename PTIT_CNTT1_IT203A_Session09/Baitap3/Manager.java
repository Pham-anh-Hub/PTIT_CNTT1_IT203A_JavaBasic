package PTIT_CNTT1_IT203A_Session09.Baitap3;

public class Manager extends Employee{
    public String department;

    public Manager(String fullname, double salary, String department) {
        super(fullname, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: " + this.department);
    }
}
