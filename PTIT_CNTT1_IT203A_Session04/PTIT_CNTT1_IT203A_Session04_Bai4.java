package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PTIT_CNTT1_IT203A_Session04_Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Regex: 2 chữ hoa + 4 số năm + 5 số ngẫu nhiên = 11 ký tự
        String regex = "[A-Z]{2}[0-9]{9}";

        System.out.print("Nhập vào mã thẻ (VD: TV202412345): ");
        String cardId = sc.nextLine();

        if (cardId.matches(regex)) {
            System.out.println("Mã thẻ hợp lệ");
        } else {
            if (cardId.length() != 11) {
                System.out.println("Mã thẻ chưa hợp lệ");
            } else if (!cardId.substring(0, 2).matches("[A-Z]{2}")) {
                System.out.println("Mã thiếu hoặc sai tiền tố");
            } else if (!cardId.substring(2, 6).matches("[0-9]{4}")) {
                System.out.println("Năm không hợp lệ (phải là 4 chữ số)");
            } else if (!cardId.substring(6, 11).matches("[0-9]{5}")) {
                System.out.println("5 ký tự cuối phải là số ngẫu nhiên");
            }
        }
    }
}
