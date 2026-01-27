package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session01_Bai2 {
    public static double getFine(int lateDays, int bookQuantity){
        return lateDays * bookQuantity * 5000;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int lateDays = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        int borrowedBooks = sc.nextInt();


        System.out.println("Tiền phạt gốc: " + getFine(lateDays, borrowedBooks));
        System.out.println("Tiền phạt sau điều chỉnh: " + (lateDays > 7 && borrowedBooks >= 3 ? getFine(lateDays, borrowedBooks)*1.2 : getFine(lateDays, borrowedBooks)));
        System.out.println("Yêu cầu khóa thẻ: " + (getFine(lateDays, borrowedBooks) > 50000 ? "true" : "false"));
    }
}
