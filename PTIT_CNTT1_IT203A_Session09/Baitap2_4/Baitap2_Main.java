package PTIT_CNTT1_IT203A_Session09.Baitap2_4;

public class Baitap2_Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bull", 4, "Brownn", 10);
        Animal cat = new Cat("Anh", 4, "White", 5);

        dog.sound();

        cat.sound();
    }
}
