package PTIT_CNTT1_IT203A_Session10.Baitap3;

public class BaiTap3_Main {
    public static void main(String[] args) {
        Animal duck = new Duck("Donal");
        Animal fish = new Fish("Nemo");

        System.out.println("Vịt " + duck.name + " " + ((Duck) duck).swim() + " và " + ((Duck) duck).fly());
        System.out.println("Ca " + fish.name + " " + ((Fish) fish).swim());
    }
}
