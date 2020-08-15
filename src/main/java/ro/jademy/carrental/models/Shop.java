package ro.jademy.carrental.models;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.*;
import ro.jademy.carrental.services.interfaces.CarFilterService;
import ro.jademy.carrental.services.interfaces.CustomerFilterService;
import ro.jademy.carrental.users.Customer;

import java.util.List;
import java.util.Scanner;

public class Shop {

    private static final Scanner input = new Scanner(System.in);
    private CarFilterService carFilterService = new CarFilterServiceImpl();
    private CustomerFilterService customerFilterService = new CustomerFilterServiceImpl();
    private RegistrationServiceImpl registrationService = new RegistrationServiceImpl();
    private LoginServiceImpl loginService = new LoginServiceImpl();
    private MenuDisplayServiceImpl menuDisplayService = new MenuDisplayServiceImpl();

    public List<Car> getAllCars() {
        return carFilterService.getAllCars();
    }
    public List<Customer> getAllCustomers() {
        return customerFilterService.getAllCustomers();
    }


    public void mainMenuController() {

        do {
            System.out.println("");
            menuDisplayService.displayMainMenu();
            System.out.println("If you don't have an account yet, register now for free!");
            System.out.println("Please, choose your option from down below: ");
            int option = input.nextInt();
            switch (option) {
                case 1: // Registration
                    registrationService.initiateRegistration();
                    break;
                case 2: // Login
                    loginService.initiateLogIn();
                    if (loginService.isLoggedInAsSalesman()) {
                        menuDisplayService.displaySalesmanMenu();
                    } else {
                        customerSubMenuController();
                    }
                    break;
                case 3: // Exit app
                    loginService.exitApp();
                default: // In case of picking a wrong option
                    System.out.println("Wrong option. Please, try again!");
                    break;
            }
        } while (!loginService.isLoggedIn());
    }

    public void customerSubMenuController() {
        String keyword;
        do {
            System.out.println("");
            menuDisplayService.displayCustomerMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = input.nextInt();
            switch (option) {
                case 1: // List all cars
                    break;
                case 2: // List available cars
                    break;
                case 3: // Filter by:
                    label1: do {
                        System.out.println("");
                        menuDisplayService.displayCarFilterMenu();
                        option = input.nextByte();
                        switch (option) {
                            case 1: // Filter by make
                                System.out.println("Please, enter a make brand:");
                                input.skip("\n");
                                keyword = input.nextLine().toUpperCase(); // de testat pt BMW
                                carFilterService.filterCarByMake(keyword);
                                break;
                            case 2: // Filter by model
                                System.out.println("Please, enter a model:");
                                input.skip("\n");
                                keyword = input.nextLine().toUpperCase();
                                carFilterService.filterCarByModel(keyword);
                                break;
                            case 3: // Filter by budget
                                System.out.println("Please, enter your budget:");
                                input.skip("\n");
                                keyword = input.nextLine().toUpperCase();
                                carFilterService.filterCarByBaseRentPrice(Integer.parseInt(keyword));
                                break;
                            case 4: // Filter by fuelType
                                System.out.println("Please, enter your favourite fuel-type " +
                                        "(Petrol/Diesel/Electricity):");
                                input.skip("\n");
                                keyword = input.nextLine().toUpperCase();
                                carFilterService.filterCarByFuelType(keyword);
                                break;
                            case 5: // Return to previous menu
                                break label1;
                            case 6: // Logout
                                loginService.doLogOut();
                                break;
                            default: // In case of picking a wrong option
                                System.out.println("Invalid choice. Please, choose only between displayed options!");
                                break;
                        }
                    } while (loginService.isLoggedInAsCustomer());
                    break;
                case 4: // Change Password
                    break;
                case 5: // Logout
                    loginService.doLogOut();
                    break;
                case 6: // Exit app
                    loginService.exitApp();
                    break;
                default: // In case of picking a wrong option
                    System.out.println("Invalid choice. Please, choose only between displayed options!");
                    break;
            }
        } while (loginService.isLoggedInAsCustomer());
    }

    public void salesmanSubMenuController() {

    }

















    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}
