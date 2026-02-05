package PTIT_CNTT1_IT203A_Session09.Baitap6;

public class Circle extends Shape{
    public double round;

    public Circle(double round) {
        this.round = round;
    }

    public double area(double round) {
        return 3.14 * round * round;
    }
}
