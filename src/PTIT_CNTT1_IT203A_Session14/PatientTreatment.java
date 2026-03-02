package PTIT_CNTT1_IT203A_Session14;

public class PatientTreatment {
    String name;
    int age;
    String department;

    public PatientTreatment(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " - " + age + " tuổi";
    }
}
