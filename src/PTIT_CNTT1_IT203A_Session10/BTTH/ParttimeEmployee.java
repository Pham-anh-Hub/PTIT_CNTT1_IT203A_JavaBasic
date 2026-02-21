package PTIT_CNTT1_IT203A_Session10.BTTH;

public class ParttimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public int getWorkingHours() {
        return workingHours;
    }

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

}
