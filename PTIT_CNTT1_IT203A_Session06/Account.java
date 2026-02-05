package PTIT_CNTT1_IT203A_Session06;

public class Account {
    // username, password, email
    public String username;
    private  String password;
    protected String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String updatePass){
        this.password = updatePass;
        System.out.println("Đổi mật khẩu thành công");
    }

    public void showAccountInfor(){
        System.out.println("Tên người dùng: " + this.username + " | " + "Mật khẩu: " + ("*").repeat(this.password.length()) + " | " + "Email: " + this.email);
    }
}
