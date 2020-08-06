package ro.jademy.carrental.model;

import java.util.ArrayList;
import java.util.List;

public class User {

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
