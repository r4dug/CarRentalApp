package ro.jademy.carrental.model;

import ro.jademy.carrental.data.DataSource;
import ro.jademy.carrental.services.PaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalShop implements PaymentService {

    private Scanner sc = new Scanner(System.in);
    CarState carState = new CarState();

    public boolean login(String username, String password) {

        // TODO: implement a basic user login

        return false;
    }

    public void showMenu() {

        login();

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to Beanie Car Rental    |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Rent a car");
        System.out.println("5. Logout");
        System.out.println("6. Exit");

        menuOptions();
    }

/*    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        System.out.println("4. Back to previous menu");

    }*/

    public void menuOptions() {
        System.out.println("\nChoose an option\n");
        String optionSelected = sc.nextLine();
        switch (optionSelected) {
            case "1":
                listAllCars();
                break;
            case "2":
                listAvailableCars();
                break;
            case "3":
                listRentedCars();
                break;
            case "4":
                rentACar();
                break;
            case "5":
                System.out.println("Logged out.");
                login();
                break;
            case "6":
                System.exit(0);
                break;

            default:
                System.out.println("Choose a correct option.");

        }

    }

    public void login() {
        boolean isLogin = false;
        do {
            System.out.println("Please enter your username and password");
            System.out.println("Username:");
            String username = sc.nextLine();
            for (User users : DataSource.USER_LIST) {
                if (username.equals(users.getUsername())) {
                    System.out.println("Password:");
                    String password = sc.nextLine();
                    if (password.equals(users.getPassword())) {
                        System.out.println("Successfully logged in.");
                        isLogin = true;
                    }
                } else System.out.println("Wrong username or password , please try again.");
            }
        } while (!isLogin);
    }


    private void listAllCars() {

        System.out.println("Beanie Car Rental fleet: ");
        for (Car car : DataSource.CAR_LIST) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

    }


    private void listAvailableCars() {

        for (Car car : DataSource.CAR_LIST)
            if (!carState.isRented()) {
                System.out.println(car.getMake() + " " + car.getModel());
            }

    }


    private void listRentedCars() {

        for (Car car : DataSource.CAR_LIST)
            if (carState.isRented()) {
                System.out.println(car.getMake() + " " + car.getModel());
            }
    }

    private void rentACar() {

        CarState carState = new CarState();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM uuuu");
        System.out.println("Available cars:");
        listAvailableCars();
        System.out.println();
        System.out.println("Enter the desired car model: ");
        String carModel = sc.nextLine();
        System.out.println("Type in the desired rental start date.");
        System.out.println("Please choose the following date pattern: DD Mmm YYYY");
        String startDate = sc.nextLine();
        System.out.println("Type in the desired rental end date.");
        System.out.println("Please choose the following date pattern: DD Mmm YYYY");
        String endDate = sc.nextLine();


        for (Car car : DataSource.CAR_LIST) {
            if (car.getModel().equals(carModel)) {
                LocalDate start = LocalDate.parse(startDate, formatter);
                LocalDate end = LocalDate.parse(endDate, formatter);
                System.out.println("Congratulations! You have just rented the " + car.getModel() + " for the following period: " + start + "  " + end);
                // now the rented car must be removed from the CAR_LIST and isRented state must be set to TRUE
                carState.rentCar(start, end);

            }
        }
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    @Override
    public boolean validatePayment(PaymentDetails paymentDetails) {
        return true;
    }
}
