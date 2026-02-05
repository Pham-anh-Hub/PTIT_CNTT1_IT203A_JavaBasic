package PTIT_CNTT1_IT203A_Session09.Baitap2_4;

public class Baitap4_Main {
    public static void main(String[] args){
        Animal animal = new Dog();

        // Gọi phương thức chung
        animal.sound();

        // Kiểm tra và ép kiểu về Dog để sử dụng phương thức riêng của dog
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.smell();
        }
    }
}
