package ro.jademy.carrental.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    List<RentedCar> rentedCarHistory = new ArrayList<>();

    public RentedCar getCurrentRentedCar() {
        for (RentedCar rentedCarItem : rentedCarHistory ) {

            if (rentedCarItem.isCurrentlyRented()) {
                return rentedCarItem;
            }
        }
        return null;
    }
}
