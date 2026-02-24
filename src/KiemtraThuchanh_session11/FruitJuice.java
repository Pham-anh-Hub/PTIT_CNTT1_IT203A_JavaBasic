package KiemtraThuchanh_session11;

public class FruitJuice extends Drink implements IMixable{
    int discountPercent;

    public FruitJuice() {
    }

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        return this.price - (this.price * discountPercent/100);
    }

    @Override
    void displayInfor() {
        super.displayInfor();
        System.out.println("Discount: " + this.discountPercent + "%");
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}
