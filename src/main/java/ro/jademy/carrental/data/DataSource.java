package ro.jademy.carrental.data;

import ro.jademy.carrental.model.Car;
import ro.jademy.carrental.model.Customer;
import ro.jademy.carrental.model.User;
import ro.jademy.carrental.model.cars.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {

    // create a list with the users

    public static ArrayList<User> getUserList() {

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new Customer("ion", "1234", "Ion", "Ionescu", 28, 9));
        userList.add(new Customer("popescu", "1234", "Popescu", "Popescovici", 43, 20));
        userList.add(new Customer("maria", "1234", "Maria", "Marinescu", 21, 3));

        return userList;
    }


    // create a list with the cars
    public static ArrayList<Car> getCarList() {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Audi("Audi", "A3", "Petrol", "Compact", "Manual", "A223132", 4, 2, 50));
        carList.add(new Audi("Audi", "A5", "Diesel", "Sedan", "Manual", "A700690", 5, 4, 90));
        carList.add(new Audi("Audi", "Q5", "Diesel", "SUV", "Automatic", "A331332", 5, 4, 130));
        carList.add(new BMW("BMW", "3 Series", "Diesel", "Sedan", "Manual", "B113321", 5, 4, 70));
        carList.add(new BMW("BMW", "5 Series", "Diesel", "Sedan", "Automatic", "B991337", 5, 4, 90));
        carList.add(new BMW("BMW", "X4", "Diesel", "SUV", "Automatic", "B552002", 5, 4, 100));
        carList.add(new Dacia("Dacia", "Spring", "Eletric", "Compact", "Automatic", "D777775", 4, 4, 65));
        carList.add(new Dacia("Dacia", "Sandero", "Petrol", "Compact", "Manual", "D777774", 4, 4, 30));
        carList.add(new Dacia("Dacia", "Duster", "Petrol", "SUV", "Manual", "D777773", 5, 4, 40));
        carList.add(new Fiat("Fiat", "500", "Petrol", "Compact", "Manual", "F522122", 4, 2, 35));
        carList.add(new Fiat("Fiat", "Tipo", "Petrol", "Compact", "Manual", "F522120", 4, 2, 35));
        carList.add(new Hyundai("Hyundai", "i30", "Diesel", "Compact", "Manual", "H411233", 5, 4, 55));
        carList.add(new Hyundai("Hyundai", "IONIQ", "Hybrid", "Sedan", "Automatic", "H411234", 5, 4, 75));
        carList.add(new Hyundai("Hyundai", "KONA", "Electric", "SUV", "Automatic", "H411235", 5, 4, 100));
        carList.add(new Nissan("Nissan", "Leaf", "Electric", "Compact", "Automatic", "N300120", 4, 4, 60));
        carList.add(new Nissan("Nissan", "Qashqai", "Diesel", "SUV", "Manual", "N300121", 5, 4, 80));
        carList.add(new Nissan("Nissan", "Juke", "Petrol", "SUV", "Manual", "N300122", 5, 4, 65));
        carList.add(new Toyota("Toyota", "C-HR", "Hybrid", "SUV", "Automatic", "T123456", 5, 4, 100));
        carList.add(new Toyota("Toyota", "Yaris", "Diesel", "Compact", "Manual", "T123000", 4, 4, 50));
        carList.add(new Toyota("Toyota", "Corolla", "Diesel", "Sedan", "Manual", "T244003", 5, 4, 75));
        carList.add(new Volkswagen("Volkswagen", "Golf", "Petrol", "Compact", "Manual", "V882345", 4, 2, 50));
        carList.add(new Volkswagen("Volkswagen", "Jetta", "Hybrid", "Sedan", "Automatic", "V882344", 5, 4, 80));
        carList.add(new Volkswagen("Volkswagen", "T-ROC", "Diesel", "SUV", "Automatic", "V882346", 5, 4, 80));

        return carList;

    }

}
