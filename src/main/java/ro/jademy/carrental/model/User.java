package ro.jademy.carrental.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
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
