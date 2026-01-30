package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai3 {
    public static void main(String[] args){
        Product product = new Product("P001", "Laptop DELL core intel", 15000000);
        product.showProductInfo();
        // set lại với giá không hợp lệ
        product.setPrice(-20000000);
        product.showProductInfo();
    }
}
