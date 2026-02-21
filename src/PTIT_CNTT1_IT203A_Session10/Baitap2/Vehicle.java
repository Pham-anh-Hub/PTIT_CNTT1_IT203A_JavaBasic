package PTIT_CNTT1_IT203A_Session10.Baitap2;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();
}
