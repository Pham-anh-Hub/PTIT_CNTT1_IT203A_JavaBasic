package OntapHackathon;

import java.util.Scanner;

public class Bai5_GiaoCua2Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng thứ nhất: ");
        int size1 =  sc.nextInt();
        int[] nums1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Nhập số phần tử mảng thứ hai: ");
        int size2 =  sc.nextInt();
        int[] nums2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] betweens = new int[size1 + size2];
        int k = 0;
        int size3 = 0;

        for (int i = 0; i < size2; i++) {
            if(existed(nums1, nums2[i]) && !existed(betweens, nums2[i])){
                betweens[k++] = nums2[i];
                size3++;
            }
        }

        if (size3 > 0){
            System.out.println("Các phần tử chung: ");
            for (int i = 0; i < size3; i++) {
                System.out.print(betweens[i] + " ");
            }
        }




    }
    public static boolean existed(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target){
                return true;
            }
        }
        return false;
    }
}
