package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session02_Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã khu vực: ");
        String location = sc.next().trim().toUpperCase();
        switch (location){
            case "A":
                System.out.println("Vị trí: Tầng 1 - Sách Văn học");
                break;
            case "B":
                System.out.println("Vị trí: Tầng 2 - Sách Khoa học");
                break;
            case "C":
                System.out.println("Vị trí: Tầng 3 - Sách Ngoại ngữ");
                break;
            case "D":
                System.out.println("Vị trí: Tầng 4 - Sách Tin học");
                break;
            default:
                System.out.println("Mã khu vực không hợp lệ");
        }
    }
}
