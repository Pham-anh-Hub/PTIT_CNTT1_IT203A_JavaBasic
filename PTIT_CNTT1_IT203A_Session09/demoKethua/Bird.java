package PTIT_CNTT1_IT203A_Session09.demoKethua;

import java.util.Scanner;

public class Bird extends Animal{
    public Scanner sc = new Scanner(System.in);
    protected boolean isFly;
    protected String birdSound;

    public Bird() {
        super();
    }

    public Bird(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }


    public void input(){
       super.input();
        System.out.print("Chim có thể bay hay không(true/false): ");
        this.isFly = Boolean.parseBoolean((sc.nextLine()));
        System.out.print("Tiếng kêu: ");
        this.birdSound = sc.nextLine();
    }

    public void display(){
        super.display();
        System.out.println(this.isFly ? "Chim có thể bay" : "Chim không thể bay");
        System.out.println("Tiếng kêu: " + this.birdSound);
    }


}
