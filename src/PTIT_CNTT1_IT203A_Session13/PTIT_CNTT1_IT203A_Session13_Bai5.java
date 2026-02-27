package PTIT_CNTT1_IT203A_Session13;

import java.util.*;

public class PTIT_CNTT1_IT203A_Session13_Bai5 {
    static Scanner sc = new Scanner(System.in);
    static List<Patient> patientList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            showMenu();
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    static void showMenu() {
        System.out.println("====================== MENU ======================");
        System.out.println("1. Tiếp nhận bệnh nhân                        ");
        System.out.println("2. Cập nhật chẩn đoán                         ||");
        System.out.println("3. Xuất viện                                  ||");
        System.out.println("4. Sắp xếp danh sách bệnh nhân                ||");
        System.out.println("5. Hiển thị danh sách bệnh nhân               ||");
        System.out.println("6. Thoát                                      ||");
        System.out.println("================================================"
                );
    }

    // ================== CHỨC NĂNG 1 ==================
    static void addPatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Patient p : patientList) {
            if (p.getId() == id) {
                System.out.println("ID đã tồn tại. Không thể thêm.");
                return;
            }
        }

        System.out.print("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công.");
    }

    // ================== CHỨC NĂNG 2 ==================
    static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Patient p : patientList) {
            if (p.getId() == id) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Chẩn đoán đã được cập nhật.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }

    // ================== CHỨC NĂNG 3 ==================
    static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        int id = Integer.parseInt(sc.nextLine());

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                System.out.println("Bệnh nhân đã được xuất viện.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }

    // ================== CHỨC NĂNG 4 ==================
    static void sortPatients() {
        patientList.sort((p1, p2) -> {
            if (p2.getAge() != p1.getAge()) {
                return p2.getAge() - p1.getAge(); // tuổi giảm dần
            }
            return p1.getFullName().compareToIgnoreCase(p2.getFullName()); // tên A-Z
        });

        System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
    }

    // ================== CHỨC NĂNG 5 ==================
    static void displayPatients() {
        System.out.println("============== Danh sách bệnh nhân ==============");

        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}