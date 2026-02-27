package PTIT_CNTT1_IT203A_Session13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session13_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Trường hợp 1 (Integer)
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(101);
        arr1.add(102);
        arr1.add(105);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(102);
        arr2.add(105);
        arr2.add(108);

        List<Integer> result = findCommonPatient(arr1, arr2);
        for (Integer e : result){
            System.out.print(e + " ");
        }

        System.out.println("\nTest case 2: ");
        // Trường hợp 2 (String)
        List<String> arr3 = List.of("DN01", "DN02", "DN03");
        List<String> arr4 = List.of("DN02", "DN04");
        List<String> result2 = findCommonPatient(arr3, arr4);
        for (String e : result2){
            System.out.print(e + " ");
        }




    }
    public static <T> List<T> findCommonPatient(List<T> arr1, List<T> arr2){
        List<T> result = new ArrayList<>();
        for (int i=0, j=0; i<arr1.size(); i++){
            if(existed(arr2, arr1.get(i))){
                result.add(arr1.get(i));
            }
        }
        return result;
    }

    public static <T> boolean existed(List<T> arr, T check){
        for(T e : arr){
            if(e == check){
                return true;
            }
        }
        return false;
    }

}
