package PTIT_CNTT1_IT203A_Session07;

import java.util.Scanner;

public class ScoreUtils {
    public static Scanner sc = new Scanner(System.in);
    public static void checkPass(double score){
        if (score >= 5) {
            System.out.println("Đạt");
        }else {
            System.out.println("Trượt");
        }
    }

    public static void calculateAverage(double[] scores){
        double total = 0;
        int quantity = 0;
        for (double score : scores){
            total+= score;
            quantity++;
        }
        System.out.printf("Điểm trung bình: %.2f", (total/quantity));
    }
}
