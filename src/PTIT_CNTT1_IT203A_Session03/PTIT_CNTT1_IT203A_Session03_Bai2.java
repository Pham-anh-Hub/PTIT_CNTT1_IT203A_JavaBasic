package PTIT_CNTT1_IT203A_Session03;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session03_Bai2 {
    public static Scanner sc = new Scanner(System.in);
    protected static String[] books = {"Book 1", "Lão Hạc", "Book 2", "Tắt đèn", "Book 3"};

    public static int searchBooks(String[] arr, String targetSearch){
        for (int i=0; i<arr.length; i++){
            if(targetSearch.trim().equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.print("Nhập tên sách cần tìm: ");
        String target = sc.nextLine();
        if(searchBooks(books, target) != -1){
            System.out.println("Tìm thấy sách " + "'" + target + "'" + " tại vị trí số: " + searchBooks(books, target));
        }else{
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
