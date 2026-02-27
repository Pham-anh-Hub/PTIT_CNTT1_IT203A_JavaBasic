package PTIT_CNTT1_IT203A_Session13;

import java.util.ArrayList;

public class PTIT_CNTT1_IT203A_Session13_Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> tempuratures = new ArrayList<>();
        tempuratures.add(36.5);
        tempuratures.add(40.2);
        tempuratures.add(37.0);
        tempuratures.add(12.5);
        tempuratures.add(39.8);
        tempuratures.add(99.9);
        tempuratures.add(36.8);


        System.out.println("Danh sách ban đầu: ");
        for (int i = 0; i < tempuratures.size(); i++) {
            System.out.print(tempuratures.get(i) + " ");
        }


        for (int i = 0; i < tempuratures.size(); i++) {
            if(tempuratures.get(i) >= 42.0 || tempuratures.get(i) <= 34.0){
                tempuratures.set(i, null);
            }
        }



        Double total = 0.0;
        int count = 0;
        System.out.println("\nDanh sách sau khi lọc: ");
        for (int i = 0; i < tempuratures.size(); i++) {
            if(tempuratures.get(i) != null){
                System.out.print(tempuratures.get(i) + " ");
                total += tempuratures.get(i);
                count++;
            }

        }

        System.out.println("\nNhiệt độ trung bình: " + total/count);




    }
}
