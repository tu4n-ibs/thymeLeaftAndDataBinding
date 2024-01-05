package com.example.thuchanh2.service;

import com.example.thuchanh2.model.Login;
import com.example.thuchanh2.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("tuanIvan", "123456", "vuong van tuan", "tuan@gmail.com", 19));
        userList.add(new User("vuongIvan", "232323", "vuong van", "van@gmail.com", 20));
        userList.add(new User("vanIvuong", "555555", "vuong", "vuong@gmail.com", 21));
    }

    public static User checkLogin(Login login) {
        for (User user : userList) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }


}
