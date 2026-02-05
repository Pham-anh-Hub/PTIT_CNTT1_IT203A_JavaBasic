package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai4 {

    public static void main(String[] args){
        // Đối tượng với contructor không tham số
        Employee employee1 = new Employee();
        employee1.employeeId = "EM001";
        employee1.name = "Phạm Văn D";
        employee1.salary = 15000000;

        // Đối tượng với contructor gồm mã và tên
        Employee employee2 = new Employee("EM002", "Nguyễn Văn B");

        // Đối tượng với contructor Có đầy đủ mã, tên, lương
        Employee employee3 = new Employee("EM003", "Trần Thị C", 20000000);

        System.out.println("Nhân viên 1: ");
        employee1.showEmployeeInfo();

        System.out.println("Nhân viên 2: ");
        employee2.showEmployeeInfo();

        System.out.println("Nhân viên 3: ");
        employee3.showEmployeeInfo();
    }
}
