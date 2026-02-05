package PTIT_CNTT1_IT203A_Session09.demoKethua;

import java.util.Scanner;

public class Animal {
    public Scanner sc = new Scanner(System.in);
    public String animalName;
    public int numberOfLegs;
    public String furColor;
    public double averageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getAverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public void setAverageLifeExpectancy(double averageLifeExpectancy) {
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public void input(){
        System.out.println("\n--- NHẬP THÔNG TIN ---");
        System.out.print("Tên: ");
        this.animalName = sc.nextLine();
        System.out.print("Số chân: ");
        this.numberOfLegs = sc.nextInt();
        sc.nextLine();
        System.out.print("Màu lông: ");
        this.furColor = sc.nextLine();
        System.out.print("Tuổi thọ trung bình: ");
        this.averageLifeExpectancy = sc.nextDouble();
    }

    public void display(){
        System.out.println("Tên: " + this.animalName);
        System.out.println("Số chân: " + this.numberOfLegs);
        System.out.println("Màu lông: " + this.furColor);
        System.out.println("Tuổi thi trung bình: " + this.averageLifeExpectancy);

    }
}
