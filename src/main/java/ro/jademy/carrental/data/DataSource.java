package ro.jademy.carrental.data;

import ro.jademy.carrental.model.Car;
import ro.jademy.carrental.model.cars.Toyota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {

    // create a list with the users

    // create a list with the cars
    public static final List<Car> CAR_LIST = Arrays.asList(
            new Toyota("Toyota", "C-HR", "Hybrid", "SUV", "Automatic", 123456, 5, 4, 100)

    );

}
