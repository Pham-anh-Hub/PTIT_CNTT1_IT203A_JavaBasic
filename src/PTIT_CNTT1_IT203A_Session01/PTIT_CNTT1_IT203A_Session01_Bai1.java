package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session01_Bai1 {
    public static int getBookAge (int publishedYear){
        return 2026 - publishedYear;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();
        System.out.print("Sách còn trong kho(true/false): ");
        boolean isAvailable = sc.nextBoolean();


        System.out.println("-- PHIẾU THÔNG TIN SÁCH --");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + getBookAge(publishYear));
        System.out.print("Giá bán: " + price);
        System.out.println("\nTình trạng: " + (isAvailable ? "Còn sách" : "Hết sách"));

    }


}
