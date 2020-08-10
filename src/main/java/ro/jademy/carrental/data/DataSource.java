package ro.jademy.carrental.data;

import ro.jademy.carrental.model.Car;
import ro.jademy.carrental.model.User;
import ro.jademy.carrental.model.cars.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {

    // create a list with the users

    public static final List<User> USER_LIST = Arrays.asList(

            new User("user1", "1234")

    );

    // create a list with the cars
    public static final List<Car> CAR_LIST = Arrays.asList(

            new Audi("Audi", "A3", "Petrol", "Compact", "Manual", "A223132", 4, 2, 50),
            new Audi("Audi", "A5", "Diesel", "Sedan", "Manual", "A700690", 5, 4, 90),
            new Audi("Audi", "Q5", "Diesel", "SUV", "Automatic", "A331332", 5, 4, 130),
            new BMW("BMW", "3 Series", "Diesel", "Sedan", "Manual", "B113321", 5, 4, 70),
            new BMW("BMW", "5 Series", "Diesel", "Sedan", "Automatic", "B991337", 5, 4, 90),
            new BMW("BMW", "X4", "Diesel", "SUV", "Automatic", "B552002", 5, 4, 100),
            new Dacia("Dacia", "Spring", "Eletric", "Compact", "Automatic", "D777775", 4, 4, 65),
            new Dacia("Dacia", "Sandero", "Petrol", "Compact", "Manual", "D777774", 4, 4, 30),
            new Dacia("Dacia", "Duster", "Petrol", "SUV", "Manual", "D777773", 5, 4, 40),
            new Fiat("Fiat", "500", "Petrol", "Compact", "Manual", "F522122", 4, 2, 35),
            new Fiat("Fiat", "Tipo", "Petrol", "Compact", "Manual", "F522120", 4, 2, 35),
            new Hyundai("Hyundai", "i30", "Diesel", "Compact", "Manual", "H411233", 5, 4, 55),
            new Hyundai("Hyundai", "IONIQ", "Hybrid", "Sedan", "Automatic", "H411234", 5, 4, 75),
            new Hyundai("Hyundai", "KONA", "Electric", "SUV", "Automatic", "H411235", 5, 4, 100),
            new Nissan("Nissan", "Leaf", "Electric", "Compact", "Automatic", "N300120", 4, 4, 60),
            new Nissan("Nissan", "Qashqai", "Diesel", "SUV", "Manual", "N300121", 5, 4, 80),
            new Nissan("Nissan", "Juke", "Petrol", "SUV", "Manual", "N300122", 5, 4, 65),
            new Toyota("Toyota", "C-HR", "Hybrid", "SUV", "Automatic", "T123456", 5, 4, 100),
            new Toyota("Toyota", "Yaris", "Diesel", "Compact", "Manual", "T123000", 4, 4, 50),
            new Toyota("Toyota", "Corolla", "Diesel", "Sedan", "Manual", "T244003", 5, 4, 75),
            new Volkswagen("Volkswagen", "Golf", "Petrol", "Compact", "Manual", "V882345", 4, 2, 50),
            new Volkswagen("Volkswagen", "Jetta", "Hybrid", "Sedan", "Automatic", "V882344", 5, 4, 80),
            new Volkswagen("Volkswagen", "T-ROC", "Diesel", "SUV", "Automatic", "V882346", 5, 4, 80)

    );



}
