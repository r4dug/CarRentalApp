package ro.jademy.carrental.services;

import ro.jademy.carrental.model.Car;
import java.util.List;

public interface CarFilterService {

    List<Car> filterByMake(String make);
    List<Car> filterByModel(String model);
    List<Car> filterByFuelType(String model);
    List<Car> filterByTransmissionType(String transmissionType);
    List<Car> filterByPrice(int minPrice, int maxPrice);


}
