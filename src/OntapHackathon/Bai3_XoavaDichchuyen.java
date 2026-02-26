package OntapHackathon;

import java.util.Scanner;

public class Bai3_XoavaDichchuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào độ dài mảng thực thi: ");
        int size = sc.nextInt();
        System.out.println("Nhập các phần tử mảng: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng nhập vào: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println("\nNhập vào giá trị cần xóa: ");
        int target = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(arr[i] == target){
                size = removeElement(arr, i, size);
            }
        }

        System.out.println("Sau khi thực hiện loại bỏ: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static int removeElement(int[] arr, int index, int size){
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        return size-1;
    }
}
