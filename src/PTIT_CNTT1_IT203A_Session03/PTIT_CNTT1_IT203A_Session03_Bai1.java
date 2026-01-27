package PTIT_CNTT1_IT203A_Session03;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session03_Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] addBookToLibraries(int n){
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Sách thứ " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println(" -- KẾT QUẢ -- ");
        System.out.print("Danh sách mã sách: ");
        for(int num : arr){
            System.out.print("\t" + num);
        }
    }

    public static void main(String[] args){
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int length = sc.nextInt();
        System.out.println("Nhập mã số cho " + length + " cuốn sách: ");
        int[] numbers = addBookToLibraries(length);
        displayLibraries(numbers);
    }
}
