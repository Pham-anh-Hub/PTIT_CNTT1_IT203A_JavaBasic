package PTIT_CNTT1_IT203A_Session07;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session07_Bai3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra Đạt/Trượt");
        System.out.print("Nhập điểm cần kiểm tra: ");
        double score = sc.nextDouble();
        ScoreUtils.checkPass(score);


        System.out.println("================================");
        System.out.print("\nTính điểm trung bình");
        System.out.print("\nNhập số điểm: ");
        int quantity = sc.nextInt();
        double[] scores = new double[quantity];
        System.out.println("Nhập các điểm: ");
        for (int i=0; i<quantity; i++){
            scores[i] = sc.nextDouble();
        }
        ScoreUtils.calculateAverage(scores);

    }
}
