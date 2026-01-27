package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session01_Bai3 {
    public static void main(String[] args){
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // In ra trước khi thay đổi
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", " + "Book2 = " + book2);

        // Tiến hành hoán đổi vị trí
        String temp = book1; // Gán giá trị book1 vào biến tạm
        book1 = book2; // Gán giá trị book2 vào book1
        book2 = temp; // Gán lại giá trị book1 cho book2

        // Sau khi hoán đổi
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", " + "Book2 = " + book2);
    }
}
