package PTIT_CNTT1_IT203A_Session14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PTIT_CNTT1_IT203A_Session14_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> patients = new HashSet<>();


        System.out.println("Nhập vào thông tin bệnh nhân(x để dừng): VD: Nguyễn Văn A – Yên Bái ");
        while (true){
            String input = sc.nextLine();
            if (input.equals("x")){
                break;
            }
            if(!patients.contains(input)){
                patients.add(input);
            }
        }

        System.out.println("Danh sách bệnh nhân: ");
        for (String p : patients){
            System.out.println(p);
        }
    }
}
