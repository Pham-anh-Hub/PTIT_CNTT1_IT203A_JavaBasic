package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

import static java.lang.Math.round;

public class PTIT_CNTT1_IT203A_Session01_Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách: ");
        double bookPrice = sc.nextDouble();
        System.out.print("Nhập tỷ giá: ");
        float price = sc.nextFloat();

        long result = round(bookPrice * price);

        System.out.print("Kết quả: " + result);
    }
}
