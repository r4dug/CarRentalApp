package ro.jademy.carrental.services;

import ro.jademy.carrental.model.User;
import java.util.List;

public interface AuthService {

    User login(List<User> users, String username, String password);
}
