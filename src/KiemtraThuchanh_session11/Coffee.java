package KiemtraThuchanh_session11;

public class Coffee extends Drink{
    boolean hasMilk;

    public Coffee() {
    }

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        if(hasMilk){
            return this.price + 5000;
        }
        return this.price;
    }

    @Override
    void displayInfor() {
        super.displayInfor();
        System.out.println(hasMilk ? "Có sữa" : "Không sữa");
    }
}
