package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session02_Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maxLend = 0;
        int minLend = 999;
        int lendTemp, totalLend = 0;
        for (int i=1; i<8; i++){
            if(i<7) {
                System.out.print("Nhập lượt mượn ngày Thứ " + (i + 1) + ": ");
                lendTemp = sc.nextInt();
            }else{
                System.out.print("Nhập lượt mượn ngày Chủ Nhật: ");
                lendTemp = sc.nextInt();
            }
            totalLend += lendTemp;

            if(lendTemp > maxLend){
                maxLend = lendTemp;
            }
            if(lendTemp < minLend){
                minLend = lendTemp;
            }
        }
        float avgLend = totalLend / 7;
        System.out.println("--- KẾT QUẢ THỐNG KÊ ---");
        System.out.println("Lượt mượn cao nhất: " + maxLend);
        System.out.println("Lượt mượn thấp nhất: " + minLend);
        System.out.print("Trung bình lượt mượn/ngày: " + avgLend);
    }
}
