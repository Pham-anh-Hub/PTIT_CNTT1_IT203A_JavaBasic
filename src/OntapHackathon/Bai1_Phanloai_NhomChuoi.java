package OntapHackathon;

import java.util.Scanner;

public class Bai1_Phanloai_NhomChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần thực thi: ");
        String input = sc.nextLine();

        char[] na = {'u', 'e', 'o', 'a', 'i'};

        String nguyenAm = "";
        String phuAm = "";



        for (int i = 0; i < input.length(); i++) {
            if(checkExist(na, input.charAt(i))){
                nguyenAm += Character.toLowerCase(input.charAt(i)) ;
            }else{
                if(!Character.isSpaceChar(input.charAt(i)) && Character.isAlphabetic(input.charAt(i))){
                    phuAm += Character.toLowerCase(input.charAt(i)) ;
                }

            }
        }

        System.out.println("Nguyên âm: " + nguyenAm);
        System.out.println("Phụ âm: " + phuAm);
    }
    public static boolean checkExist (char[] arr, char target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == Character.toLowerCase(target)){
                return true;
            }
        }
        return false;
    }
}
