package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai5 {
    public static void main(String[] args){
        Book book = new Book("B001", "Sách số 1", "Trần Văn A", 2020, 150000);
        System.out.printf("%-8s | %-30s | %-20s | %-12s | %-12s\n", "Mã sách", "Tên sách", "Tác giả", "Năm xuất bản", "Giá");
        book.showBookInfo();
    }

}
