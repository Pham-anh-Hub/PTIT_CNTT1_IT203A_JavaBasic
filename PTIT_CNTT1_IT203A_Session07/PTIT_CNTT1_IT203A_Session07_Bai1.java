package PTIT_CNTT1_IT203A_Session07;

public class PTIT_CNTT1_IT203A_Session07_Bai1 {
    public static void main(String[] args){
        Student student1 = new Student("SD001", "Nguyen Van A");
        Student student2 = new Student("SD002", "Nguyen Van B");

        System.out.println("Thông tin sinh viên: ");
        student1.showStudentInfo();
        student2.showStudentInfo();

        System.out.println("\nTổng số sinh viên đã tạo: " + Student.studentQuantity());
    }
}
