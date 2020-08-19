package ro.jademy.carrental.model;

import ro.jademy.carrental.data.DataSource;
import ro.jademy.carrental.services.*;

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
    private CarFilterService carFilterService = new CarFilterServiceImpl();
    private RentingService rentingService = new RentingServiceImpl();

    public void showMenu() {

        login();

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to RAGU Car Rental    |");
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
        System.out.println("\nChoose an option:      [Press S for Search]\n");
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
                System.out.println("Client "+currentUser.getFullName()+ " has to pay a total of "+currentUser.getTotalAmountToBePaid());
                System.out.println();
                System.out.println("Press P to go to Payment Details or anything else on the keyboard to continue browsing the application.");
                String output = sc.nextLine();
                if (output.equalsIgnoreCase("p")) {
                    System.out.println("Payment details!");
                }
                else {
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
                break;
            case "6":
                System.out.println("Logged out.");
                login();
                break;
            case "7":
                System.exit(0);
                break;

            case "S":
                carFilterSubMenu();
                break;

            default:
                System.out.println("Choose a correct option.");
                menuOptions();
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
                System.out.println("Incorrect Username/Password! Please try again.");
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
                        " | Rented period: " + carList.get(i).getFirstDayOfRental() + " - " + carList.get(i).getLastDayOfRental());
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

              // calculate the amount which has to be paid by the client for the chosen car
                long carPrice = calculatePrice((int) differenceInDays, carList.get(i - 1));
                System.out.println("Total price: " + carPrice);

                // now the rented car must be marked as "rented"
                // assign to the rented car the pick up date and return date
                carList.get(i - 1).setRented(true);
                carList.get(i - 1).setFirstDayOfRental(start);
                carList.get(i - 1).setLastDayOfRental(end);

                //user who rented this car must be logged in RentedCarHistory

                // if the client rents more than one car, the amount for the current one has to be stored
                totalAmountToBePaid(currentUser,carPrice);
            }
        }
        printMainMenu();
        menuOptions();
    }

    public long calculatePrice(int numberOfDays, Car car) {
        // calculate the price user has to pay for renting a car
        int price = car.getPricePerDay() * numberOfDays;
        return price;
    }

    private User totalAmountToBePaid(User currentUser, long carPrice) {
        // calculate the total amount that has to be paid if the user rents more cars in the same session
        currentUser.setTotalAmountToBePaid(currentUser.getTotalAmountToBePaid()+carPrice);

        return currentUser;
    }


    private void carFilterSubMenu() {

        System.out.println();
        System.out.println("Select 1 to search by make.");
        System.out.println("Select 2 to search by model.");
        System.out.println("Select 3 to search by fuel type.");
        System.out.println("Select 4 to search by transmission type.");
        System.out.println("Select 5 to search by price.");
        System.out.println("\nChoose an option or press B to go back to the main menu\n");

        String optionSelected = sc.nextLine();
        switch (optionSelected) {
            case "1":
                // filter cars by MAKE
                System.out.println("Please type the car make you are searching for.");
                String make = sc.nextLine();
                carFilterService.filterByMake(make);
                System.out.println();
                System.out.println("Select R to rent a car or B to go back to the main menu");
                String userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("r")) {
                    // rent the desired car
                  //  rentingService.rentCarAfterFiltering();

                } else if (userInput.equalsIgnoreCase("b")) {
                    printMainMenu();
                    menuOptions();
                } else {
                System.out.println("Please select a valid input!"); }
                break;
            case "2":
                // filter cars by MODEL
                System.out.println("Please type the car model you are searching for.");
                String model = sc.nextLine();
                carFilterService.filterByModel(model);
                System.out.println();
                System.out.println("Select R to rent a car or B to go back to the main menu");
               String userInput2 = sc.nextLine();
                if (userInput2.equalsIgnoreCase("r")) {
                    // rent the desired car

                } else if (userInput2.equalsIgnoreCase("b")) {
                    printMainMenu();
                    menuOptions();
                } else {
                System.out.println("Please select a valid input!"); }
                break;
            case "3":
                // filter cars by FUEL TYPE
                System.out.println("Please enter the desired fuel type.");
                String fuelType = sc.nextLine();
                carFilterService.filterByFuelType(fuelType);
                System.out.println();
                System.out.println("Select R to rent a car or B to go back to the main menu");
                String userInput3 = sc.nextLine();
                if (userInput3.equalsIgnoreCase("r")) {
                    // rent the desired car

                } else if (userInput3.equalsIgnoreCase("b")) {
                    printMainMenu();
                    menuOptions();
                } else {
                System.out.println("Please select a valid input!"); }
                break;
            case "5":
                // filter cars by PRICE
                System.out.println("Please enter a range of prices.");
                System.out.println();
                System.out.println("Minimum price: ");
                int minimumPrice = sc.nextInt();
                System.out.println("Maximum price: ");
                int maximumPrice = sc.nextInt();
                carFilterService.filterByPrice(minimumPrice,maximumPrice);
                System.out.println();
                break;
            case "B":
               menuOptions();
                break;
            default:
                System.out.println("Choose a correct option.");
                carFilterSubMenu();

        }

    }

    private void printMainMenu () {
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Rent a car");
        System.out.println("5. Total amount to be paid");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
    }

    @Override
    public boolean validatePayment(PaymentDetails paymentDetails) {
        return true;
    }
}
