package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session02_Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int point = 100;
        int lateDays;
        String rank = "";
        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ. Nhập 999 để kết thúc)");
        do {

            System.out.print("Số ngày trễ của lần này: ");
            lateDays = sc.nextInt();
            if(lateDays <= 0){
                  point += 5;
            }else if (lateDays > 0 && lateDays != 999){
                point -= lateDays * 2;
                System.out.println("--> Trả trễ " + lateDays + " ngày: " + "-" + (lateDays*2) + " điểm");
            }else{
                break;
            }
        }while (lateDays != 999);
        if(point > 120){
            rank = "Độc giả thân thiết";
        }else if(point >= 80){
            rank = "Độc giả tiêu chuẩn";
        }else {
            rank = "Độc giả cần lưu ý";
        }


        System.out.println("Tổng điểm uy tín: " + point);
        System.out.println("Xếp loại: " + rank.toUpperCase());

    }
}
