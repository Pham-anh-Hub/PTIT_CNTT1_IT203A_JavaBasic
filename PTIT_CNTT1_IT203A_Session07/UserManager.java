package PTIT_CNTT1_IT203A_Session07;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static List<User> users = new ArrayList<>();

    // 1. addUser
    public static void addUser(User u){
        users.add(u);
        System.out.println("Thêm mới người dùng thành công");
    }

    public static void  printUsers(){
        for (User u : users){
            System.out.println(u.toString());
        }
    }

    // 2. CheckLogin
    public static boolean checkLogin(String username, String password){
        for (User u : users){
            if(u.username.equals(username) && u.password.equals(password)){
                return true;
            }
        }
        return false;
    }
}
