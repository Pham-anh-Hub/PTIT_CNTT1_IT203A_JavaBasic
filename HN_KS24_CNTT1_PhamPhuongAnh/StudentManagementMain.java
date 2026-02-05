package HN_KS24_CNTT1_PhamPhuongAnh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementMain {
    public static List<Student> studentsList = new ArrayList<>();

    public static void addNewStudent(Scanner sc) {
        Student newStudent = new Student();
        System.out.println("--- NHẬP THÔNG TIN SINH VIÊN ---");

        boolean idValid;
        do {
            idValid = true;
            System.out.print("Nhập mã sinh viên: ");
            String sId = sc.nextLine();

            for (Student s : studentsList) {
                if (s.id.equals(sId)) {
                    System.out.println("Mã sinh viên đã tồn tại!");
                    idValid = false;
                    break;
                }
            }

            if (idValid && (!sId.startsWith("SV") || sId.length() < 5)) {
                System.out.println("Mã sinh viên chưa hợp lệ!");
                idValid = false;
            }

            if (idValid) newStudent.id = sId;
        } while (!idValid);

        do {
            System.out.print("Tên sinh viên: ");
            newStudent.name = sc.nextLine();
            if (newStudent.name.trim().isEmpty()) {
                System.out.println("Lỗi: Tên không được để trống!");
            }
        } while (newStudent.name.trim().isEmpty());

        do {
            System.out.print("Nhập điểm số (0 - 10): ");
            newStudent.score = sc.nextDouble();
            sc.nextLine();

            if (newStudent.score < 0 || newStudent.score > 10) {
                System.out.println("Điểm chưa hợp lệ");
            }
        } while (newStudent.score < 0 || newStudent.score > 10);

        studentsList.add(newStudent);
        System.out.println("Thêm mới sinh viên thành công!");
    }

    public static void searchStudentByRank(Scanner sc) {
        System.out.print("Nhập học lực cần tìm (Xuất sắc/Giỏi/Khá/TB/Yếu): ");
        String keyword = sc.nextLine();
        boolean found = false;

        for (Student s : studentsList) {
            if (s.getRank().equalsIgnoreCase(keyword)) {
                System.out.println(s.id + " | " + s.name + " | Điểm: " + s.score + " | XL: " + s.getRank());
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên nào xếp loại: " + keyword);
    }

    public static void sortByScore() {
        int n = studentsList.size();
        if (n == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studentsList.get(j).score < studentsList.get(j + 1).score) {
                    Student temp = studentsList.get(j);
                    studentsList.set(j, studentsList.get(j + 1));
                    studentsList.set(j + 1, temp);
                }
            }
        }

        System.out.println("--- DANH SÁCH SINH VIÊN ĐÃ SẮP XẾP  ---");
        for (Student s : studentsList) {
            System.out.println("ID: " + s.id + " | Tên: " + s.name + " | Điểm: " + s.score + " | Xếp loại: " + s.getRank());
        }
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
            System.out.println("\tChọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addNewStudent(sc);
                    break;
                case 2:
                    if (studentsList.isEmpty()){
                        System.out.println("Danh sách sinh viên trống");
                    }else{
                        System.out.println("DANH SÁCH SINH VIÊN");
                        for(Student student : studentsList){
                            System.out.println(student.toString());
                        }
                    }
                    break;
                case 3:
                    if (studentsList.isEmpty()){
                        System.out.println("Danh sách sinh viên trống");
                    }else{
                        searchStudentByRank(sc);
                    }
                    break;
                case 4:
                    if (studentsList.isEmpty()){
                        System.out.println("Danh sách sinh viên trống");
                    }else{
                        sortByScore();
                    }
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
