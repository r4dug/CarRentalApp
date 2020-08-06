package ro.jademy.carrental.model;

import java.util.Scanner;

public class RentalShop {

   private Scanner sc = new Scanner(System.in);

    public boolean login(String username, String password) {

        // TODO: implement a basic user login

        return false;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Car Rental Shop     |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        System.out.println("4. Back to previous menu");

        menuOptions();

    }

    public void menuOptions() {
        System.out.println("\nChoose an option\n");
        String optionSelected = sc.nextLine();
        switch(optionSelected) {
            case "1":
                // method to filter by make
                break;
            case "2":
                // method to filter by model
                break;
            case "3":
                // method to filter by budget
                break;
            case "4":
              showListMenuOptions();
                break;

            default:
                System.out.println("Choose a correct option.");

        }

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

}
