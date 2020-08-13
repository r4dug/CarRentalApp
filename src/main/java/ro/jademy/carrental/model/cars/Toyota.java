package ro.jademy.carrental.model.cars;
import ro.jademy.carrental.model.Car;



public class Toyota extends Car {

    public Toyota(String make, String model, String fuelType, String carType, String transmissionType, String carId, int nrOfSeats, int nrOfDoors, int pricePerDay) {
        super(make, model, fuelType, carType, transmissionType, carId, nrOfSeats, nrOfDoors, pricePerDay);
    }
}
