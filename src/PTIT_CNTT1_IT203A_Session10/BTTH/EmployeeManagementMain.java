package PTIT_CNTT1_IT203A_Session10.BTTH;

import java.util.Scanner;

public class EmployeeManagementMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== QUẢN LÝ NHÂN SỰ =====\n" +
                    "1. Thêm nhân sự\n" +
                    "2. Hiển thị danh sách nhân sự\n" +
                    "3. Tìm kiếm nhân sự theo mã\n" +
                    "4. Xoá thông tin nhân sự theo mã\n" +
                    "0. Thoát\n");
            System.out.println("\t Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    // Thêm nhân sự
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    break;
            }

        }while(choice != 0);
    }
}
