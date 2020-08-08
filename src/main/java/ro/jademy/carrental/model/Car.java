package ro.jademy.carrental.model;

import java.time.LocalDate;

public class Car {

    private String make;
    private String model;
    private String fuelType;
    private String carType;
    private String transmissionType;
    private int carId;
    private int nrOfSeats;
    private int nrOfDoors;
    private double pricePerDay;
    private boolean isRented;
    private LocalDate year;

    public Car () { }

    public Car (String make, String model, String fuelType, String carType, String transmissionType, int carId , int nrOfSeats, int nrOfDoors, double pricePerDay)
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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
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

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }


}
