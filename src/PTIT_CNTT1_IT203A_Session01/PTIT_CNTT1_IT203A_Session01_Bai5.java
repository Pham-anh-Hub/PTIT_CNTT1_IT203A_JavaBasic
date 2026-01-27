package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session01_Bai5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int number = sc.nextInt();

        int thousand = number / 1000;
        int hundreds = (number % 1000) / 100;
        int dozens = ((number % 1000) % 100) / 10;
        int units = ((number % 1000) % 100) % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + units );
        System.out.println("Kết quả kiểm tra mã sách: " + ((thousand + hundreds + dozens) % 10 == units ? "HỢP LỆ" : "SAI MÃ"));

    }
}
