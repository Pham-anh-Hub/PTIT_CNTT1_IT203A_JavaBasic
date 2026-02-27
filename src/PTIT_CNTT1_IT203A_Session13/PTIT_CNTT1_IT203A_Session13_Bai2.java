package PTIT_CNTT1_IT203A_Session13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session13_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> phamacities = new ArrayList<>();
        System.out.println("Input (Nhập x để dừng): ");
        String input = "";
        while(input.compareTo("x") != 0){
            input = sc.nextLine();
            if(!existed(phamacities, input) && input.compareTo("x") != 0){
                phamacities.add(input);
            }
        }

        System.out.println("Output: ");
        for (String e : phamacities){
            System.out.print(e + " ");
        }

    }
    public static boolean existed(List<String> arr, String check){
        for (String e : arr){
            if(e.compareTo(check) == 0){
                return true;
            }
        }
        return false;
    }
}
