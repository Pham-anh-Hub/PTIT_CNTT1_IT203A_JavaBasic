package PTIT_CNTT1_IT203A_Session07;

public class Student {
    public String studentId;
    public String fullname;
    public static int totalStudent = 0;

    public Student(String studentId, String fullname) {
        this.studentId = studentId;
        this.fullname = fullname;
        totalStudent++;
    }

    public void showStudentInfo(){
        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Tên sinh viên: " + this.fullname);
    }
    public static int studentQuantity(){
        return totalStudent;
    }
}
