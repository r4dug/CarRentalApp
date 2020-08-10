package ro.jademy.carrental.model;

import java.time.LocalDate;

public class CarState extends Car{

    private boolean isRented = false;
    private LocalDate startDate;
    private LocalDate endDate;


    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void rentCar(LocalDate start, LocalDate end) {
        setRented(true);
        setStartDate(start);
        setEndDate(end);
    }

    public void returnCar() {
        setRented(false);
        setStartDate(null);
        setEndDate(null);
    }

}
