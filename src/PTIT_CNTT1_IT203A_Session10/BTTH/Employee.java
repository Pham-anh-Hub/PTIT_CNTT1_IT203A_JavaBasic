package PTIT_CNTT1_IT203A_Session10.BTTH;

import java.util.Scanner;

public abstract class Employee implements IEmployee{
    private String id;
    private String name;
    private int age;

    public Scanner sc = new Scanner(System.in);


    public Employee() {
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void input() {
        System.out.print("Nhập mã nhân viên: ");
        setId(sc.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        setName(sc.nextLine());
        System.out.print("Nhập tuổi nhân viên: ");
        setAge(sc.nextInt());

    }

    @Override
    public void display() {
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Tuổi nhân viên: " + getAge());
    }

    public abstract double getSalary();
}
