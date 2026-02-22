package PTIT_CNTT1_IT203A_Session10.BTTH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class EmployeeManagementMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Employee[] employees = new Employee[10000];
        int choice, size = 0;

        do {
            System.out.println("\n===== QUẢN LÝ NHÂN SỰ =====\n" +
                    "1. Thêm nhân sự\n" +
                    "2. Hiển thị danh sách nhân sự\n" +
                    "3. Tìm kiếm nhân sự theo mã\n" +
                    "4. Xoá thông tin nhân sự theo mã\n" +
                    "0. Thoát\n");
            System.out.print("\t Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int addChoice;
                    System.out.println("1.\tNhân sự Full-time\n" +
                            "2.\tNhân sự Part-time\n");
                    addChoice = sc.nextInt();
                    if (addChoice == 1) {
                        Employee fulltimeEm = new FulltimeEmployee();
                        fulltimeEm.input();
                        size = addToArray(employees, fulltimeEm, size);
                        // Không nên dùng exit(0) vì nó sẽ tắt luôn ứng dụng.
                        // Nếu muốn thoát vòng lặp sau khi thêm xong, dùng break;
                    }
                    else if (addChoice == 2) {
                        Employee parttimeEm = new ParttimeEmployee();
                        parttimeEm.input();
                        size = addToArray(employees, parttimeEm, size);
                    }
                    else if (addChoice != -1) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
                    }

                    break;
                case 2:
                    // Hiển thị dữ liệu mảng
                    System.out.println("Danh sách nhân viên");
                    for (int i=0 ; i<size; i++){
                        employees[i].display();
                        System.out.println("-------------------------------");
                    }
                    break;
                case 3:
                    // Tìm kiếm nhân viên
                    searchEmployee(employees, size);
                    break;
                case 4:
                    // Xóa nhân viên
                    size = deleteEmployee(employees, size);
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }


        }while(choice != 0);
    }

    public static int addToArray(Employee[] arr, Employee e, int length){
        arr[length] = e;
        length++;
        return length;
    }

    public static void searchEmployee (Employee[] arr, int length){
        sc.nextLine();
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String targetId = sc.nextLine();
        if (targetId == ""){
            System.out.println("Mã nhân viên cần tìm không hợp lệ");
            return;
        }
        int founded=0;
        for(int i=0; i<length; i++){
            if(arr[i].getId().equals(targetId)){
                System.out.println("Nhân viên cần tìm: ");
                arr[i].display();
                founded = 1;
                break;
            }
        }
        if (founded == 0){
            System.out.println("Không tìm thấy nhân viên");
        }
    }
    public static int deleteEmployee(Employee[] arr, int length){
        sc.nextLine();
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String targetId = sc.nextLine();
        if (targetId.isEmpty()){
            System.out.println("Mã nhân viên cần xóa không hợp lệ");
            return length;
        }
        int targetIndex = -1;
        for (int i=0; i<length; i++){
            if(arr[i].getId().equals(targetId)){
                targetIndex = i;
                break;
            }
        }
        if(targetIndex == -1){
            System.out.println("Nhân viên cần xóa không tồn tại");
            return length;
        }
        for (int i=targetIndex; i<length-1; i++){
            arr[i] = arr[i+1];
        }
        return --length;


    }

}
