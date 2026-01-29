package PTIT_CNTT1_IT203A_Session05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PTIT_CNTT1_IT203A_Session05_menuKiemTra {
    public static void displayList(String[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.println((i+1) + ". " + arr[i]);
        }
    }

    public static int insertNewStudent(String[] arr, String newId, int size){
        // MSSV phải bắt đầu bằng chữ B, theo sau là đúng 7 chữ số
        String regex = "B\\d{7}";
        if (newId.matches(regex)) {
            arr[size] = newId;
            System.out.println("Thêm thành công!");
            return size + 1; // Tăng size và trả về
        } else {
            System.out.println("Mã sinh viên không hợp lệ, vui lòng nhập lại!");
            return size; // Giữ nguyên size
        }
    }

    public static void updateStudentId(String[] arr, String updateId, int index){
        String regex = "B\\d{7}";
        if(updateId.matches(regex)){
            arr[index] = updateId;
        }else{
            System.out.println("Mã sinh viên không hợp lệ, vui lòng nhập lại!");
        }
    }

    public static int searchStudentId (String[] ids,int size, String target){
        String regex = "[a-zA-Z0-9]{7}";
        if (target.length() < 7 && target.matches(regex)){
            for (int i=0; i<size; i++){
                if(ids[i].toLowerCase().contains(target.toLowerCase().trim())){
                    return i;
                }
            }

        }else{
            System.out.println("Chuỗi nhập vào không hợp lệ");
        }
        return -1;
    }





    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, size = 0;
        String[] studentIds = new String[100];


        do {
            System.out.println(" --- QUẢN LÝ MÃ SỐ SINH VIÊN ---");
            System.out.println(" 1. Hiển thị");
            System.out.println(" 2. Thêm mới ");
            System.out.println(" 3. Cập nhật");
            System.out.println(" 4. Xóa");
            System.out.println(" 5. Tìm kiếm");
            System.out.println(" 6. Thoát");
            System.out.print(" Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    // In ra danh sách MSSV hiện có
                    if(size > 0){
                        System.out.println("Danh sách sinh viên: ");
                        displayList(studentIds, size);
                    }else{
                        System.out.println("Danh sách sinh viên trống.");
                    }
                    break;
                case 2:
                    // Thêm mới (Có Regex): * Yêu cầu nhập MSSV mới
                    sc.nextLine();
                    System.out.print("Nhập mã sinh viên mới: ");
                    String newStudentId = sc.nextLine();
                    if(newStudentId.equalsIgnoreCase("")){
                        System.out.println("");
                    }else{
                        size = insertNewStudent(studentIds, newStudentId, size);
                    }
                    break;
                case 3:
                    // Nhập vị trí (index) cần sửa, kiểm tra tính hợp lệ của index cho phép nhập MSSV mới (cũng phải thỏa mãn Regex)
                    System.out.print("Nhập vị trí cần cập nhật: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if(index>=0 && index<size){
                        System.out.print("Nhập mã sinh viên cập nhật: ");
                        String updateId = sc.nextLine();
                        if(!updateId.trim().equals("")){
                            updateStudentId(studentIds, updateId, index-1);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí cần xóa: ");
                    int deleteIdx = sc.nextInt() - 1;
                    if (deleteIdx >= 0 && deleteIdx < size) {
                        for (int i = deleteIdx; i < size - 1; i++) {
                            studentIds[i] = studentIds[i + 1];
                        }
                        size--;
                        System.out.println("Xóa thành công!");
                    }
                    break;
                case 5:
                    // Tìm kiếm (Regex)
                    sc.nextLine();
                    System.out.print("Nhập chuỗi mã sinh viên cần tìm: ");
                    String searchString = sc.nextLine();
                    int targetIndex = searchStudentId(studentIds, size, searchString);
                    if(targetIndex != -1){
                        System.out.println("Mã sinh viên cần tìm ở vị trí có chỉ số: " + targetIndex);
                    }else{
                        System.out.println("Không tìm thấy mã sinh viên");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }


        }while (choice != 6);


    }
}
