package OntapHackathon;

import java.util.Scanner;

public class Bai2_KytuXuathienNhieunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi thao tác: ");
        String input = sc.nextLine();

        char target = ' ';
        int targetCount = 0;

        for (int i = 0; i < input.length(); i++) {
            int currentCount = 0;
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)){
                    currentCount++;
                }
            }
            if(currentCount > targetCount){
                targetCount = currentCount;
                target = input.charAt(i);
                System.out.println(target);
            }
        }

        // r, g, m đều xuất hiện 2 lần, nhưng r xuất hiện trước
        System.out.println("Target: " + target);
    }
}
