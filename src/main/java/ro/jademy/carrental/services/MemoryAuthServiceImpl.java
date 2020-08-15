package ro.jademy.carrental.services;

import ro.jademy.carrental.model.User;

import java.util.List;

public class MemoryAuthServiceImpl implements AuthService {

    public User login(List<User> users, String username, String password) {

        for (User user : users) {
            if (username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }

        return null;
    }
}
