package PTIT_CNTT1_IT203A_Session03;

import java.util.Scanner;

public class BaiTapTongHop {
    // Hàm cập nhật số lượng sách
    public static void updateBookQuantity(int[] quantityArr, int[] bookArr, int bookId, int total, int updateQuantity){
        int target = -1;
        for (int i=0; i<total; i++){
            if(bookArr[i] == bookId){
                target = i;
                break;
            }
        }
        if(target == -1){
            System.out.println("Mã sách không tồn tại");
        }else{
            quantityArr[target] = updateQuantity;
            System.out.println("Cập nhật số lượng sách thành công");
        }
    }

    // Hàm xóa sách
    public static int deleteBook(int id, int[] bookIds, String[] titles, int[] bookQuantities, int total){
        int target = -1;
        for (int i=0; i<total; i++){
            if(bookIds[i] == id){
                target = i;
                break;
            }
        }
        if(target == -1){
            System.out.println("Mã sách không tồn tại");
            return bookIds.length;
        }
        for(int i = target; i<total-1; i++){
            bookIds[i] = bookIds[i+1];
            titles[i] = titles[i+1];
            bookQuantities[i] = bookQuantities[i+1];
        }
        System.out.println("Xóa sách thành công");
        return total - 1;
    }

    public static void main(String[] args) {
        int choose;
        Scanner sc = new Scanner(System.in);

        int[] ids;
        String[] titles;
        int[] quantities;

        int n;
        do{
            System.out.println("Nhập vào số lượng sách cần quản lý: ");
            n = sc.nextInt();
            if(n<1){
                System.out.println("Số lượng sách cần quản lý phải >1");
            }
        }while(n<1);

        //Khởi tạo 3 mảng
        ids = new int[n];
        titles = new String[n];
        quantities = new int[n];

        int total = 0;

        while (true) {
            System.out.println("\n-------------  MENU -------------");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật số lượng");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp theo số lượng giảm dần");
            System.out.println("7. Thoát");
            System.out.println("Mời chọn chức năng: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    if(total==0){
                        System.out.println("Chưa có thông tin sách nào");
                    }else{
                        System.out.println("Thông tin các sách đang quản lý: ");
                        for(int i=1;i<=54;i++){
                            System.out.print("-");
                        }
                        System.out.printf("\n|%-10s|%-30s|%-10s|\n","Mã sách","Tên sách","Số lượng");
                        for(int i=1;i<=54;i++){
                            System.out.print("-");
                        }
                        for(int i=0;i<total;i++){
                            System.out.printf("\n|%-10d|%-30s|%-10d|\n",ids[i],titles[i],quantities[i]);
                            for(int j=1;j<=54;j++){
                                System.out.print("-");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào mã sách mới: ");
                    ids[total] = sc.nextInt();
                    System.out.println("Nhập vào tên sách mới: ");
                    sc.nextLine();
                    titles[total] = sc.nextLine();
                    System.out.println("Nhập vào số lượng sách mới: ");
                    quantities[total] = sc.nextInt();
                    total++;
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    int bookId = sc.nextInt();
                    System.out.print("Nhập số lượng sách cần cập nhật: ");
                    int updateQuantity = sc.nextInt();
                    updateBookQuantity(quantities, ids, bookId, total, updateQuantity);
                    break;
                case 4:
                    System.out.print("Nhập id sách cần xóa: ");
                    int deleteID = sc.nextInt();
                    total = deleteBook(deleteID, ids, titles, quantities, total);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Bạn phải chọn từ 1 đến 7");
            }
        }
    }
}
