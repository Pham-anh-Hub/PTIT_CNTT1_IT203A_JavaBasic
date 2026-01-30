package PTIT_CNTT1_IT203A_Session06;

import java.text.NumberFormat;
import java.util.Locale;

public class Book {
//    Tạo lớp Book
    public String bookId;
    public String title;
    public String author;
    public int publishedYear;
    public double price;

//    Constructor
//    Sử dụng this để gán giá trị
    public Book(String bookId, String title, String author, int publishedYear, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
    }

//    Phương thức hiển thị thông tin sách
    public void showBookInfo(){
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%-8s | %-30s | %-20s | %-12d | %-12.2f", this.bookId, this.title, this.author, this.publishedYear, this.price);
    }
}
