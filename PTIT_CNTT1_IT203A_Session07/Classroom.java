package PTIT_CNTT1_IT203A_Session07;

public class Classroom {
    public String studentName;
    public static double classFund = 0;

    public Classroom(String studentName, double classFundFee) {
        this.studentName = studentName;
        classFund += classFundFee;
    }

    // Xem tong quy lop
    public void showClassFee(){
        System.out.println("Tổng quỹ lớp: " + classFund);
    }

}
