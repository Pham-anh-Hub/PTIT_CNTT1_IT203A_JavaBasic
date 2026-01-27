package PTIT_CNTT1_IT203A_Session03;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session03_Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static void sortBooks(int[] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr){
        System.out.print("[");
        for (int i=0; i<arr.length; i++){
            if(i==0){
                System.out.print(arr[i]);
            }else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args){
        System.out.print("Nhập số lượng phần tử: ");
        int size = sc.nextInt();
        int[] bookIds = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Nhập sách " + (i+1) + ": ");
            bookIds[i] = sc.nextInt();
        }
        System.out.print("Trước khi sắp xếp: ");
        displayBooks(bookIds);
        sortBooks(bookIds);
        System.out.print("\nSau khi sắp xếp: ");
        displayBooks(bookIds);
    }
}
