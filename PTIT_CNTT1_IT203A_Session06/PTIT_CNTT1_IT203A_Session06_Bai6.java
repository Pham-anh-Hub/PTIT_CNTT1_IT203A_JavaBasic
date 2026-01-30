package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai6 {
    public static void main(String[] args) {
        User user = new User("US001", "Nguyễn Văn A", "nvanhh12345", "nva@gmail.com");

        System.out.println("Thông tin người dùng:  ");
        user.showUserInfo();

        // set lại mật khẩu và email test phương thức set
        user.setPassword("");
        user.setEmail("nvagmail.123");
    }
}
