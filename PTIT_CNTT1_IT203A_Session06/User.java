package PTIT_CNTT1_IT203A_Session06;

import java.util.regex.Pattern;

public class User {
    // id, username, password, email
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String password) {
        if(!password.trim().isEmpty()) {
            this.password = password;
        }else{
            System.out.println("Mật khẩu không được trống");
        }
    }

    public void setEmail(String email) {
        String regex = "[\\w]@[a-z].[a-z]";
        if(email.matches(regex) & !email.isEmpty()){
            this.email = email;
        }else{
            System.out.println("Email không hợp lệ ");
        }
    }

    public void showUserInfo(){
        System.out.println(this.id + " | " + this.username + " | " + ("*".repeat(this.password.length())) + " | " + this.email);
    }

}
