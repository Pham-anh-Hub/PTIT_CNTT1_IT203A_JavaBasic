package PTIT_CNTT1_IT203A_Session09.Baitap6;

import java.util.ArrayList;
import java.util.List;

public class Baitap6_Main {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.75));
        shapes.add(new Circle(4.5));
        shapes.add(new Rectangle(3, 7));
        shapes.add(new Rectangle(6, 5));

        double totalArea = 0;
        for (Shape s : shapes){
            if(s instanceof Circle){
                totalArea += ((Circle) s).area(((Circle) s).round);
            } else if (s instanceof Rectangle) {
                totalArea += ((Rectangle) s).area(((Rectangle) s).length, ((Rectangle) s).wide);
            }

        }
        System.out.println("Tổng diện tích: " + totalArea);

    }
}
