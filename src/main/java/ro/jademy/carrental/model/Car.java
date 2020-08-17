package ro.jademy.carrental.model;

import java.time.LocalDate;

public abstract class Car {

    private String make;
    private String model;
    private String fuelType;
    private String carType;
    private String transmissionType;
    private String carId;
    private int nrOfSeats;
    private int nrOfDoors;
    private int pricePerDay;
    private LocalDate firstDayOfRental;
    private LocalDate lastDayOfRental;
    private boolean isRented;

    public Car () { }

    public Car (String make, String model, String fuelType, String carType, String transmissionType, String carId , int nrOfSeats, int nrOfDoors, int pricePerDay)
    {
        this.make = make;
        this.model=model;
        this.fuelType=fuelType;
        this.carType=carType;
        this.transmissionType=transmissionType;
        this.carId=carId;
        this.nrOfSeats=nrOfSeats;
        this.nrOfDoors=nrOfDoors;
        this.pricePerDay=pricePerDay;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public LocalDate getFirstDayOfRental() {
        return firstDayOfRental;
    }

    public void setFirstDayOfRental(LocalDate firstDayOfRental) {
        this.firstDayOfRental = firstDayOfRental;
    }

    public LocalDate getLastDayOfRental() {
        return lastDayOfRental;
    }

    public void setLastDayOfRental(LocalDate lastDayOfRental) {
        this.lastDayOfRental = lastDayOfRental;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
