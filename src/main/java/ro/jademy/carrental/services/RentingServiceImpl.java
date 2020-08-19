package ro.jademy.carrental.services;

import ro.jademy.carrental.data.DataSource;
import ro.jademy.carrental.model.Car;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

public class RentingServiceImpl implements RentingService {

    private List<Car> carList = DataSource.getCarList();
    private Scanner sc = new Scanner(System.in);

    @Override
    public List<Car> rentCarAfterFiltering() {
            return null;
            }
        }

