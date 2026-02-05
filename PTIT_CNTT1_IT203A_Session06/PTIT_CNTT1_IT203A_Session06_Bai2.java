package PTIT_CNTT1_IT203A_Session06;

public class PTIT_CNTT1_IT203A_Session06_Bai2 {
    public static void main(String[] args){
        Account account1 = new Account("nguyenvana", "nva12345", "nva@gmail.com");
        Account account2 = new Account("tranthib", "ttb67890", "ttb@gmail.com");
        System.out.println("Thông tin trước khi đổi mật khẩu: ");
        account1.showAccountInfor();
        account2.showAccountInfor();
        account1.setPassword("nvanh123");
    }
}
