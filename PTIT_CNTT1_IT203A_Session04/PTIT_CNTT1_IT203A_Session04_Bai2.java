package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session04_Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mô tả sách: ");
        String description = sc.nextLine();
        StringBuilder newDescription = new StringBuilder();
        if(description.contains("Kệ: ")){
            int index = description.indexOf("Kệ: ");
            newDescription.append(description.substring(0, index));
            newDescription.append("Vị trí lưu trữ:").append(description.substring(index+3, description.length()));
            System.out.println("Mô tả mới: " + newDescription);
        }

    }
}
