package PTIT_CNTT1_IT203A_Session09.Baitap2_4;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int numberOfLength, String furColor, double averageOfAge) {
        super(name, numberOfLength, furColor, averageOfAge);
    }

    @Override
    public void sound() {
        System.out.println("Grauu grauuu");
    }

    // Phương thức riêng của dog
    public void smell(){
        System.out.println("Smell clearly");
    }
}
