package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai1 {

    public static void main(String[] args){
        // Bài 1 - Khởi tạo ít nhất 2 đối tượng sinh viên
        // Gọi phương thức hiển thị thông tin
        Student student1 = new Student("SV001" ,"Nguyễn Văn A", 2006, 7.5);
        Student student2 = new Student("SV002" ,"Nguyễn Thị B", 2007, 8.0);

        System.out.println("======== Danh sách sinh viên ========");
        student1.showStuInfo();
        student2.showStuInfo();
    }
}
