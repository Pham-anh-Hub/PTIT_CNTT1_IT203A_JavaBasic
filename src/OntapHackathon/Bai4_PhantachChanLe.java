package OntapHackathon;

import java.util.Scanner;

public class Bai4_PhantachChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[j] % 2 == 0 && arr[i] % 2 != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }

        for (int num : arr){
            System.out.print(num + " ");
        }

        // Nếu dùng hàm swap thì nên truyền cả mảng gtri và các vị trí hoán đổi
    }
}
