package ro.jademy.carrental.models;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.*;
import ro.jademy.carrental.services.interfaces.CarFilterService;
import ro.jademy.carrental.services.interfaces.UserService;
import ro.jademy.carrental.services.interfaces.CustomerStatistics;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public static final Scanner INPUT = new Scanner(System.in);
    private CarFilterService carFilterService = new CarFilterServiceImpl();
    private UserService userService = new UserServiceImpl();
    private CustomerStatistics customerStatistics = new CustomerStatisticsImpl();
    private RegistrationServiceImpl registrationService = new RegistrationServiceImpl();
    private LoginServiceImpl loginService = new LoginServiceImpl();
    private MenuDisplayServiceImpl menuDisplayService = new MenuDisplayServiceImpl();
    public List<Car> getAllCars() {
        return carFilterService.getAllCars();
    }
    public User loggedInUser;


    public void mainMenuController() {

        do {
            System.out.println();
            menuDisplayService.displayMainMenu();
            System.out.println("If you don't have an account yet, register now for free!");
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // Registration
                    registrationService.initiateRegistration();
                    break;
                case 2: // Login
                    loggedInUser = loginService.initiateLogIn();
                    if (loginService.isLoggedInAsSalesman(loggedInUser)) {
                        salesmanSubMenuController();
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
        } while (!loginService.isLoggedIn(loggedInUser));
    }

    public void customerSubMenuController() {
        String keyword;
        do {
            System.out.println();
            menuDisplayService.displayCustomerMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // List all cars
                    carFilterService.getAllCars();
                    break;
                case 2: // List available cars
                    carFilterService.getAvailableCars();
                    break;
                case 3: // Filter by:
                    label1: do {
                        System.out.println();
                        menuDisplayService.displayCarFilterMenu();
                        option = INPUT.nextByte();
                        switch (option) {
                            case 1: // Filter by make
                                System.out.println("Please, enter a make brand:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase(); // de testat pt BMW
                                carFilterService.filterByMake(keyword);
                                break;
                            case 2: // Filter by model
                                System.out.println("Please, enter a model:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                carFilterService.filterByModel(keyword);
                                break;
                            case 3: // Filter by budget
                                System.out.println("Please, enter your budget:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                carFilterService.filterByPrice(Integer.parseInt(keyword));
                                break;
                            case 4: // Filter by fuelType
                                System.out.println("Please, enter your favourite fuel-type " +
                                        "(Petrol/Diesel/Electricity):");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                carFilterService.filterByFuelType(keyword);
                                break;
                            case 5: // Return to previous menu
                                break label1;
                            case 6: // Logout
                                doLogOut();
                                break;
                            default: // In case of picking a wrong option
                                System.out.println("Invalid choice. Please, choose only between displayed options!");
                                break;
                        }
                    } while (loginService.isLoggedInAsCustomer(loggedInUser));
                    break;
                case 4: // Change Password
                    userService.changePassword(loggedInUser);
                    System.out.println(loggedInUser); //printare pentru testare
                    break;
                case 5: // Logout
                    doLogOut();
                    break;
                case 6: // Exit app
                    loginService.exitApp();
                    break;
                default: // In case of picking a wrong option
                    System.out.println("Invalid choice. Please, choose only between displayed options!");
                    break;
            }
        } while (loginService.isLoggedInAsCustomer(loggedInUser));
    }

    public void salesmanSubMenuController() {
        String keyword;
        do {
            System.out.println();
            menuDisplayService.displaySalesmanMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // Manage Customers
                    label2: do {
                        System.out.println();
                        menuDisplayService.displayCustomerFilterMenu();
                        option = INPUT.nextByte();
                        switch (option) {
                            case 1: // Access data on Customers
                                userService.displayAllCustomers();
                                break;
                            case 2: // Customer Statistics
                                customerStatistics.getCustomerStatistics();
                                break;
                            case 3: // Delete a Customer Account
                                System.out.println("Please, enter the customer's last name:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                userService.deleteCustomerAccount(userService.searchCustomer(keyword));
                                break;
                            case 4: // Delete a Salesman Account
                                System.out.println("Please, enter the salesman's last name:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                userService.deleteSalesmanAccount(userService.searchSalesman(keyword));
                                break;
                            case 5: // Return to previous menu
                                break label2;
                            case 6: // Logout
                                doLogOut();
                                break;
                            default: // In case of picking a wrong option
                                System.out.println("Invalid choice. Please, choose only between displayed options!");
                                break;
                        }
                    } while (loginService.isLoggedInAsCustomer(loggedInUser));
                    break;
                case 2: // Manage Auto Fleet
                    break;
                case 3: // Logout
                    doLogOut();
                    break;
                case 4: // Exit app
                    loginService.exitApp();
                    break;
                default: // In case of picking a wrong option
                    System.out.println("Invalid choice. Please, choose only between displayed options!");
                    break;
            }
        } while (loginService.isLoggedInAsSalesman(loggedInUser));
    }

    public void doLogOut() {
        System.out.println("Log-out successfully!");
        loggedInUser = null;
    }
}
