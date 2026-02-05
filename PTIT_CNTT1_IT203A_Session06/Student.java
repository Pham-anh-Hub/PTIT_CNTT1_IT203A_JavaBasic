package PTIT_CNTT1_IT203A_Session06;

public class Student {
    private String studentId;
    private String fullname;
    private int birthYear;
    private double avgMark;

    public Student(String id, String fullname, int birthYear, double avg){
        this.studentId = id;
        this.fullname = fullname;
        this.birthYear = birthYear;
        this.avgMark = avg;
    }

    public void showStuInfo(){
        System.out.println("ID: " + this.studentId + " | " + "Họ tên: " + this.fullname + " | " + "Năm sinh: " + this.birthYear +  " | " + "Điểm trung bình: : " + this.avgMark);
    }
}
