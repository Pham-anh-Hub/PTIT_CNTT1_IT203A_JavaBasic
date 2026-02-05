package PTIT_CNTT1_IT203A_Session09.Baitap1;

public class Student extends Person{
    private String studentId;
    private double avgMark;

    public Student() {
        super();
    }

    public Student(String fullname, int age, String studentId, double avgMark) {
        super(fullname, age);
        this.studentId = studentId;
        this.avgMark = avgMark;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mã sinh viên: " + this.studentId);
        super.displayInfo();
        System.out.println("Điểm trung bình: " + this.avgMark);
    }
}
