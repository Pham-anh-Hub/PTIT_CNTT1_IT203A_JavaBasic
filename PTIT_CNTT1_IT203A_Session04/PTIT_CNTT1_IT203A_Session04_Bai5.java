package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PTIT_CNTT1_IT203A_Session04_Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: ([a-zA-Z]+) \\| Action: ([A-Z]+) \\| BookID: ([A-Z]{2}[\\d]{5})";
        String log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345\n" +
                "2024-02-22 | User: NguyenThiB | Action: RETURN | BookID: BK12346";
        String[] logs = log.split("\n");

        int i=1;
        int countBorrow=0, countReturn=0;
        for (String e : logs){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(e);
            if(matcher.find()){
                System.out.println("log " + i++);
                System.out.println("Ngày: " + matcher.group(1));
                System.out.println("Người dùng: " + matcher.group(2));
                System.out.println("Hành động: " + matcher.group(3));
                System.out.println("Mã sách: " + matcher.group(4));
                if(matcher.group(3).equals("BORROW")){
                    countBorrow++;
                } else if (matcher.group(3).equals("RETURN")) {
                    countReturn++;
                }
            }
        }

        System.out.println("\nBORROW: " + countBorrow);
        System.out.println("RETURN: " + countReturn);

    }
}
