package ro.jademy.carrental.model.cars;

import ro.jademy.carrental.model.Car;

public class Audi extends Car {

    public Audi(String make, String model, String fuelType, String carType, String transmissionType, String carId, int nrOfSeats, int nrOfDoors, double pricePerDay) {
        super(make, model, fuelType, carType, transmissionType, carId, nrOfSeats, nrOfDoors, pricePerDay);
    }
}
