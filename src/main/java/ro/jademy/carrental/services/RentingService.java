package ro.jademy.carrental.services;

import ro.jademy.carrental.model.Car;
import java.util.List;

public interface RentingService {

    List<Car> rentCarAfterFiltering();
}
