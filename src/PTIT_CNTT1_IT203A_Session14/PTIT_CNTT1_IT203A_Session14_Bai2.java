package PTIT_CNTT1_IT203A_Session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session14_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> phamarcy = new HashMap<>();
        phamarcy.put("T01", "Paracetamol");
        phamarcy.put("T02", "Ibuprofen");
        phamarcy.put("T03", "Alpha Choay");
        phamarcy.put("T04", "Paradol");
        phamarcy.put("T05", "Vitamin E");

        String target = null;

        do {
            System.out.print("Mã thuốc cần tìm (x để thoát): ");
            String targetId = sc.nextLine();
            if(targetId.equalsIgnoreCase("x")){
                System.out.println("Thoát");
                break;
            }
            if(phamarcy.containsKey(targetId)){
                target = phamarcy.get(targetId);
                System.out.println("Tên thuốc: " + target);
            }else{
                System.out.println("Thuốc không có trong danh mục BHYT\n");
            }
        }while(true);
    }
}
