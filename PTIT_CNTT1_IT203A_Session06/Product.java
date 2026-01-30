package PTIT_CNTT1_IT203A_Session06;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    // Thuộc tính private: mã SP, tên SP, giá bán
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Giá sản phẩm không hợp lệ");
        }

    }

    public void showProductInfo(){
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        System.out.println("Mã sản phẩm: " + this.productId + " | " + "Tên sản phẩm : " + this.productName + " | " + "Giá: " + nf.format(this.price));
    }

}
