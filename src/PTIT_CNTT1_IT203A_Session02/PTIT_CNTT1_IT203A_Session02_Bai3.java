package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session02_Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Nhập số lượng sách trả muộn: ");
        int books = sc.nextInt();
        for (int i=0; i< books; i++){
            System.out.print("Nhập số ngày trễ cuốn thứ " + (i+1) + ": ");
            int days = sc.nextInt();
            total += days * 5000;
        }
        System.out.println("Tổng tiền phạt: " + total + " VND");
    }
}
