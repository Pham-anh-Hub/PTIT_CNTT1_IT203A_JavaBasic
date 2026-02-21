package PTIT_CNTT1_IT203A_Session10.Baitap2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng sức người");
    }
}
