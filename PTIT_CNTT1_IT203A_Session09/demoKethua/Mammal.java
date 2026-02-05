package PTIT_CNTT1_IT203A_Session09.demoKethua;

public class Mammal extends Animal {
    protected String foodType;
    protected boolean isLiveWithHuman;
    protected String mammalSound;

    public Mammal() {
    }

    public Mammal(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mammalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mammalSound = mammalSound;
    }

    @Override
    public void input() {
        super.input();
        sc.nextLine();
        System.out.print("Loại thức ăn: ");
        this.foodType = sc.nextLine();
        System.out.print("Sống với con người (true/false): ");
        this.isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tiếng kêu: ");
        this.mammalSound = sc.nextLine();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Loại thức ăn: " + this.foodType);
        System.out.println(this.isLiveWithHuman ? "Sống với con người" : "Không sống với con người");
        System.out.println("Tiếng kêu: " + this.mammalSound);
    }
}
