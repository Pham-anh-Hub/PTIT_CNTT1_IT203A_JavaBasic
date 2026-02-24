package KiemtraThuchanh_session11;

public abstract class Drink {
    int id;
    String name;
    double price;

    public Drink() {
    }

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();

    void displayInfor(){
        System.out.println("Mã đồ uống: " + this.id);
        System.out.println("Tên đồ uống: " + this.name);
        System.out.println("Giá gốc: " + this.price);
    }
}
