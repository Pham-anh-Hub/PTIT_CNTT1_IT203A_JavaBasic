package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session04_Bai6 {
    public static boolean checkExist(String[] arr, String check){
        for (String e : arr){
            if (check.equalsIgnoreCase(e)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] blackList = {"tệ", "ngu", "ngốc", "xấu" + "xí"};

        System.out.print("Nhập review của bạn: ");
        String review = sc.nextLine();
        System.out.println(review.length());

        String[] splitReview = review.split(" ");
        StringBuilder updateReview = new StringBuilder();
        for (String e : splitReview){
            if(updateReview.length() < 200) {
                if (checkExist(blackList, e)) {
                    updateReview.append("*".repeat(e.length())).append(" ");
                } else {
                    updateReview.append(e).append(" ");
                }
            }
        }
        updateReview.append("...");
        System.out.println("Review sau khi xử lý: " + updateReview);
    }
}
