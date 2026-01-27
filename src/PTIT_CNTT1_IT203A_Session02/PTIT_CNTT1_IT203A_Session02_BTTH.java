package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class PTIT_CNTT1_IT203A_Session02_BTTH {
//    Nhập vào n, In ra các số nguyên dương từ 1 - n
    public static boolean checkPrime(int number){
        int count = 0;
        for(int i=1; i<= number; i++){
            if(number % i == 0) {
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }

//    In ra dãy fibonacci
    public static void printFibo(int n){
        int f0 = 0, f1 = 1;
        int temp = f1;
        while (temp < n){
            System.out.print(temp + " ");
            temp = f0 + f1;
            f0 = f1;
            f1 = temp;
        }

    }

    public static void printSavePackage(){
        System.out.println("--- CÁC GÓI ĐANG CÓ ---");
        System.out.print("Gói 1 tháng: Lãi suất 3%/năm\n" +
                "Gói 2 tháng: Lãi suất 4%/năm\n" +
                "Gói 3 tháng: Lãi suất 4.5%/năm\n" +
                "Gói 4 tháng: Lãi suất 5%/năm\n" +
                "Gói 5 tháng: Lãi suất 5.5%/năm\n" +
                "Gói 6 tháng: Lãi suất 6%/năm\n" +
                "Gói 9 tháng: Lãi suất 6.5%/năm\n" +
                "Gói 12 tháng: Lãi suất 7%/năm");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào 1 số nguyên dương: ");
//        int number = sc.nextInt();
//
//        for(int i = 1; i <= number; i++){
//            if(checkPrime(i)){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.print("Nhap n: ");
//        int n = sc.nextInt();
//        printFibo(n);

//        -	Nhập vào số tiền cần gửi
//        -	Nhập vào gói cần gửi
//        -	Nhập vào số tháng gửi

        System.out.print("Nhập vào số tiền cần gửi (>10000000): ");
        long moneyIn = sc.nextLong();
        if(moneyIn < 10000000) return;
        printSavePackage();
        System.out.print("\nNhập vào gói cần gửi: ");
        int saveChoice = sc.nextInt();
        System.out.print("Nhập vào số tháng gửi: ");
        int months = sc.nextInt();

        int saveTime = months / saveChoice; // số qúy gửi
        int resMonth = months % saveChoice;
        double savePercent = 0;
        switch (saveChoice){
            case 1:
                savePercent = 3;
                break;
            case 2:
                savePercent = 4;
                break;
            case 3:
                savePercent = 4.5;
                break;
            case 4:
                savePercent = 5;
                break;
            case 5:
                savePercent = 5.5;
                break;
            case 6:
                savePercent = 6;
                break;
            case 9:
                savePercent = 6.5;
                break;
            case 12:
                savePercent = 7;
                break;
            default:
                System.out.println("Gói gửi không tồn tại");
                break;
        }

        for(int i = 0; i < saveTime; i++){
            moneyIn += moneyIn * (savePercent/100) * saveChoice/12 ;
        }
        if(resMonth>0){
            moneyIn += moneyIn * (0.3/100) * resMonth/12;
        }
        System.out.println(moneyIn);
    }
}
