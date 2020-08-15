package ro.jademy.carrental.model;

import ro.jademy.carrental.data.DataSource;
import ro.jademy.carrental.services.AuthService;
import ro.jademy.carrental.services.MemoryAuthServiceImpl;
import ro.jademy.carrental.services.PaymentService;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalShop implements PaymentService {

    private List<User> userList = DataSource.getUserList();
    private List<Car> carList = DataSource.getCarList();
    private Scanner sc = new Scanner(System.in);
    private User currentUser;
    private AuthService authService = new MemoryAuthServiceImpl();

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
        System.out.println("5. Total amount to be paid");
        System.out.println("6. Logout");
        System.out.println("7. Exit");

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
                totalAmountToBePaid();
                break;
            case "6":
                System.out.println("Logged out.");
                login();
                break;
            case "7":
                System.exit(0);
                break;

            default:
                System.out.println("Choose a correct option.");

        }

    }

    public void login() {
        do {
            System.out.println("Please enter your username and password");
            System.out.println("Username:");
            String username = sc.nextLine();
            System.out.println("Password:");
            String password = sc.nextLine();

            currentUser = authService.login(userList, username, password);


            if (currentUser == null) {
                System.out.println("Incorrect Username/Password!");
            }

        } while (currentUser == null);

        System.out.println("Login successful! Welcome, " + currentUser.getFullName() + "!");
        System.out.println();
    }

    private void listAllCars() {
        for (int i = 0; i < carList.size(); i++) {

            System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                    carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                    " -> Price per day: " + carList.get(i).getPricePerDay());
        }
        System.out.println();
        System.out.println("Select 2 to check available cars.");
        System.out.println("Select 3 to check already rented cars.");
        System.out.println("Select 4 to rent a car.");
        System.out.println("Select 5 to verify the amount to be paid.");
        System.out.println("Select 6 to login with a different user.");
        System.out.println("Select 7 to exit.");
        menuOptions();
    }


    private void listAvailableCars() {

        for (int i = 0; i < carList.size(); i++) {
            if (!carList.get(i).isRented()) {
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        System.out.println();
        System.out.println("Select 1 to check all the cars we own.");
        System.out.println("Select 3 to check already rented cars.");
        System.out.println("Select 4 to rent a car.");
        System.out.println("Select 5 to verify the amount to be paid.");
        System.out.println("Select 6 to login with a different user.");
        System.out.println("Select 7 to exit.");
        menuOptions();

    }


    private void listRentedCars() {

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).isRented() == true) {
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        System.out.println();
        System.out.println("Select 1 to check all the cars we own.");
        System.out.println("Select 2 to check already rented cars.");
        System.out.println("Select 4 to rent a car.");
        System.out.println("Select 5 to verify the amount to be paid.");
        System.out.println("Select 6 to login with a different user.");
        System.out.println("Select 7 to exit.");
        menuOptions();

    }

    private void rentACar() {

/*        boolean renting = true;
        while (renting) {*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Available cars:");
        for (int i = 0; i < carList.size(); i++) {
            if (!carList.get(i).isRented()) {
                System.out.println((i + 1) + ". [" + carList.get(i).getMake() + " " + carList.get(i).getModel() + "] | Type:" +
                        carList.get(i).getCarType() + " | Fuel:" + carList.get(i).getFuelType() + " | Transmission:" + carList.get(i).getTransmissionType() +
                        " -> Price per day: " + carList.get(i).getPricePerDay());
            }
        }
        System.out.println();
        System.out.println("Enter the desired car: ");
        String carChoice = sc.nextLine();
        System.out.println("Type in the desired rental start date.");
        System.out.println("Please choose the following date pattern: DD Mmm YYYY");
        String startDate = sc.nextLine();
        System.out.println("Type in the desired rental end date.");
        System.out.println("Please choose the following date pattern: DD Mmm YYYY");
        String endDate = sc.nextLine();

        int number = Integer.parseInt(carChoice);


        for (int i = 0; i <= carList.size(); i++) {
            if (number == i) {
                LocalDate start = LocalDate.parse(startDate, formatter);
                LocalDate end = LocalDate.parse(endDate, formatter);
                long differenceInDays = ChronoUnit.DAYS.between(start, end);
                System.out.println("Congratulations! You have just rented the [" + carList.get(i - 1).getMake() + " " + carList.get(i - 1).getModel() + "] for the following period: " + start + "  " + end);
                long carPrice = calculatePrice((int) differenceInDays, carList.get(i - 1));
                System.out.println("Total price: " + carPrice);

                // now the rented car must be removed from the CAR_LIST and isRented state must be set to TRUE
                //  user who rented this car must be logged in RentedCarHistory
                carList.get(i - 1).setRented(true);
                // carList.remove(i-1);

            }
        }
        System.out.println();
        System.out.println("What would you want to do now?");
        menuOptions();
    }

    public long calculatePrice(int numberOfDays, Car car) {
        int price = car.getPricePerDay() * numberOfDays;
/*        if (numberOfDays > 15) {
            price = (long) (car.getPricePerDay() - (numberOfDays - 15) * 10);
        }*/
        return price;
    }

    private void totalAmountToBePaid() {
        // calculate the total amount that has to be paid if the user rents more cars in the same session
        // save the amount in a list
        // add the current one to the already saved one in order to get a total amount
    }


    @Override
    public boolean validatePayment(PaymentDetails paymentDetails) {
        return true;
    }
}
