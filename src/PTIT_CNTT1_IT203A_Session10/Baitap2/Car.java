package PTIT_CNTT1_IT203A_Session10.Baitap2;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }


    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}
