package PTIT_CNTT1_IT203A_Session10.Baitap6;

public class Product {
    public String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
