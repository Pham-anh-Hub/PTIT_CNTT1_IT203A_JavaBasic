package PTIT_CNTT1_IT203A_Session10.BTTH;

public class Employee implements IEmployee{
    private String id;
    private String name;
    private int age;

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

    }

    @Override
    public void display() {

    }

    @Override
    public double getSalary() {
        return 0;
    }
}
