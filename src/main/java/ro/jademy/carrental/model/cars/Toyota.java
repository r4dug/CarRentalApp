package ro.jademy.carrental.model.cars;
import ro.jademy.carrental.model.Car;



public class Toyota extends Car {

    public Toyota(String make, String model, String fuelType, String carType, String transmissionType, int carId, int nrOfSeats, int nrOfDoors, double pricePerDay) {
        super(make, model, fuelType, carType, transmissionType, carId, nrOfSeats, nrOfDoors, pricePerDay);
    }
}
