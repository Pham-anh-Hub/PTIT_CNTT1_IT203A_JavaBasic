package PTIT_CNTT1_IT203A_Session13;
import java.util.*;
public class PTIT_CNTT1_IT203A_Session13_Bai6 {
    static Scanner sc = new Scanner(System.in);
    static List<Medicine> medicineList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            showMenu();
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
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
        System.out.println("\n========= MENU KÊ ĐƠN THUỐC =========");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ (< 50.000)");
        System.out.println("6. Thoát");
    }

    static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : medicineList) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Thuốc đã tồn tại. Nhập số lượng thêm: ");
                int extraQty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + extraQty);
                System.out.println("Đã cộng thêm số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công.");
    }

    static void updateQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Iterator<Medicine> iterator = medicineList.iterator();

        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    iterator.remove();
                    System.out.println("Thuốc đã bị xóa khỏi đơn.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Cập nhật số lượng thành công.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc.");
    }

    static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        boolean removed = medicineList.removeIf(m -> m.getDrugId().equalsIgnoreCase(id));

        if (removed) {
            System.out.println("Đã xóa thuốc.");
        } else {
            System.out.println("Không tìm thấy thuốc.");
        }
    }

    static void printInvoice() {

        if (medicineList.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }

        System.out.println("\n================ HÓA ĐƠN =================");
        System.out.printf("| %-10s | %-20s | %-10s | %-8s | %-12s |\n",
                "Mã thuốc", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");

        double total = 0;

        for (Medicine m : medicineList) {
            System.out.println(m);
            total += m.getTotalPrice();
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TỔNG TIỀN: %.0f VNĐ\n", total);

        // XÓA DANH SÁCH SAU KHI IN
        medicineList.clear();
        System.out.println("Đã hoàn tất đơn. Danh sách thuốc được làm mới.");
    }

    // ================== 5. THUỐC GIÁ RẺ ==================
    static void findCheapMedicine() {
        boolean found = false;

        System.out.println("Các thuốc có giá dưới 50.000 VNĐ:");

        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá rẻ.");
        }
    }
}

