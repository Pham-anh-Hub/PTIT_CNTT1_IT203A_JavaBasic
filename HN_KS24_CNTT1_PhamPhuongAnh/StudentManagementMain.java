package HN_KS24_CNTT1_PhamPhuongAnh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementMain {
    public static List<Student> studentsList = new ArrayList<>();

    public static void addNewStudent(Scanner sc){
        Student newStudent = new Student();
        System.out.println("NHẬP THÔNG TIN SINH VIÊN");

        do {
            System.out.print("Nhập mã sinh viên: ");
            String sId = sc.nextLine();
            for (Student s : studentsList){
                if(s.id.equals(sId)){
                    System.out.println("Mã sinh viên đã tồn tại");
                    break;
                }
            }
            if (!sId.startsWith("SV") || sId.length() == 5) {
                System.out.println("Mã sinh viên chưa hợp lệ");
                break;
            }else{
                newStudent.id = sId;
            }
        }while(!newStudent.id.equals(""));




        System.out.print("Tên sinh viên: ");
        String sName = sc.nextLine();
        if(sName.isEmpty()){
            System.out.println("Tên sinh viên không được để trống");
        }else{
            newStudent.name = sName;
        }

        System.out.print("Nhập điểm số: ");
        double score = sc.nextDouble();
        if(score < 0 && score > 10){
            System.out.println("Điểm số không hợp lệ");
        }else{
            newStudent.score = score;
        }

        studentsList.add(newStudent);
        System.out.println("Them moi thanh cong");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên ");
            System.out.println("2. Hiển thị danh sách sinh viên ");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực ");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát ");
            System.out.println("==================================");
            System.out.println("\tChọn chức năng");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addNewStudent(sc);
                    break;
                case 2:
                    if (studentsList.size() == 0){
                        System.out.println("Danh sách sinh viên trống");
                    }else{
                        for(Student student : studentsList){
                            System.out.println(student.toString());
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoát chương trình !");
                    break;
                default:
                    break;
            }

        }while (choice != 5);
    }
}
