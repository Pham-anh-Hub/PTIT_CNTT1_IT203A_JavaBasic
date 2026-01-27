package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session01_Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int book_index = sc.nextInt();
        int book_case = (book_index / 25) + 1;
        String location = (book_case >= 1 && book_case <= 10) ? "Khu Cận (Gần Cửa)" : "Khu Viễn";

        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + book_index);
        System.out.println("Địa chỉ: Kệ " + book_case + " - " + "Vị trí: " + book_index);
        System.out.println("Phân khu: " + location);
    }
}
