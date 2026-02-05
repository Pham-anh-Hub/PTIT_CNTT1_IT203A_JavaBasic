package PTIT_CNTT1_IT203A_Session09.Baitap6;

public class Rectangle extends Shape{
    public double length;
    public double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double area(double length, double wide) {
        return length * wide;
    }
}
