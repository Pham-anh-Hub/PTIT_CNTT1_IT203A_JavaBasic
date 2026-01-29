package PTIT_CNTT1_IT203A_Session05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MenuMain {

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập số nguyên!");
            }
        }
    }

    private static int readPositiveInt(Scanner sc, String prompt) {
        while (true) {
            int val = readInt(sc, prompt);
            if (val > 0) {
                return val;
            }
            System.out.println("Vui lòng nhập số nguyên dương (> 0)!");
        }
    }

    private static int[] readIntArray(Scanner sc, int n, String promptEachPrefix) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt(sc, promptEachPrefix + "[" + i + "] = ");
        }
        return arr;
    }

    // FR1:
    private static void twoSum(Scanner sc) {
        System.out.print("Nhập số lượng phần tử mảng nhập vào: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Nhập phần tử " + (i+1) + ": " );
            numbers[i] = sc.nextInt();
        }
        System.out.print("Nhập tổng cần tính: ");
        int sumTarget = sc.nextInt();
        int count = 0;

        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if(numbers[i] + numbers[j] == sumTarget){
                    System.out.println(i + ", " + j);
                    count++;
                }
            }
        }
        // Output: In ra cặp chỉ số hoặc thông báo không tìm thấy.
        if(count == 0){
            System.out.println("Không tìm thấy cặp số nào có tổng cần tìm");
        }
    }

    // FR2:
    private static void moveZeroes(Scanner sc) {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau biến đổi: " + Arrays.toString(arr));
    }

    // FR3
    private static void validPalindrome(Scanner sc) {
        System.out.println("\n[FR3] Valid Palindrome - Kiểm tra chuỗi đối xứng");
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = sc.nextLine();

        // Lam sach: lower-case + bo tat ca ky tu khong phai chu cai
        String cleaned = (str == null ? "" : str).toLowerCase().replaceAll("[^a-z]", "");

        // Chuoi rong sau khi lam sach -> coi la palindrome
        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Chuỗi sau khi làm sach: \"" + cleaned + "\"");
        System.out.println("Kết quả: " + (isPalindrome ? "Chuỗi đối xứng" : "Chuỗi không đối xứng"));
    }

    // FR4
    private static void reverseWords(Scanner sc) {
        System.out.println("\n[FR4] Reverse Words - Đảo ngược thứ tự các từ" );
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = sc.nextLine();

        if (str == null) {
            System.out.println("Kết quả: \"\"");
            return;
        }
        String trimmed = str.trim().replaceAll("\\s+", " ");
        if (trimmed.isEmpty()) {
            System.out.println("Chuỗi chỉ có khoảng trắng: \"\"");
            return;
        }
        String[] words = trimmed.split(" ");
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        System.out.println("Kết quả: " + String.join(" ", words));
    }

    // FR5
    private static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    private static boolean isHappy(int n) {
        // Dung HashSet de phat hien chu trinh (chac chan dung, khong phu thuoc so lan lap)
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumSquareDigits(n);
        }
        return n == 1;
    }

    private static void happyNumber(Scanner sc) {
        System.out.println("\n[FR5] Happy Number - Kiểm tra số hạnh phúc " );
        int n = readPositiveInt(sc, "Nhập n (số nguyên dương): ");
        System.out.println("Kết quả: " + (isHappy(n) ? "Là số hạnh phúc" : "Không phải số hạnh phúc"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= MINI PROJECT =========");
            System.out.println("1. Two Sum ");
            System.out.println("2. Move Zeroes ");
            System.out.println("3. Valid Palindrome ");
            System.out.println("4. Reverse Words ");
            System.out.println("5. Happy Number ");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            String line = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập 1-6");
                choice = -1;
            }

            switch (choice) {
                case 1:
                    twoSum(sc);
                    sc.nextLine();
                    break;
                case 2:
                    moveZeroes(sc);
                    sc.nextLine();
                    break;
                case 3:
                    validPalindrome(sc);
                    sc.nextLine();
                    break;
                case 4:
                    reverseWords(sc);
                    sc.nextLine();
                    break;
                case 5:
                    happyNumber(sc);
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập 1-6");
            }

        } while (choice != 6);

        sc.close();
    }
}