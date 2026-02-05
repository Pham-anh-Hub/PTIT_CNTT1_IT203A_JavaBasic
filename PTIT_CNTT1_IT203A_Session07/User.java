package PTIT_CNTT1_IT203A_Session07;

public class User {
    public final int id;
    public String username;
    protected String password;

    @Override
    public String toString() {
        return "ID: " + id + " - Tên đăng nhập: " + username;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
