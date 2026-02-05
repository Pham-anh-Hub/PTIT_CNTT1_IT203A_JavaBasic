package PTIT_CNTT1_IT203A_Session09.Baitap1;

public class Person {
    public String fullname;
    public int age;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Họ tên: " + this.fullname);
        System.out.println("Tuổi: " + this.age);
    }
}
