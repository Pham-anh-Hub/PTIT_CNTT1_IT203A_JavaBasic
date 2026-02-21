package PTIT_CNTT1_IT203A_Session10.Baitap3;

public class Duck extends Animal implements Swimmable, Flyable{


    public Duck(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "Có thể bay";
    }

    @Override
    public String swim() {
        return "Có thể bơi";
    }
}
