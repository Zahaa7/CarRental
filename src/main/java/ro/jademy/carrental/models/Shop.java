package ro.jademy.carrental.models;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public static final Scanner INPUT = new Scanner(System.in);


    private List<Car> carList;
    private List<User> userList;
    private List<RentedCarHistory> rentedCarList = new ArrayList<>();
    private List<RentedCarHistory> rentedCarHistoryList = new ArrayList<>();
    private List<RentedCarHistory> pendingTransactionsList = new ArrayList<>();


    // services
    private final MenuDisplayServiceImpl MENU_DISPLAY_SERVICE;
    private CustomerStatisticsImpl customerStatistics;
    private CarFilterServiceImpl carFilterService;
    private UserServiceImpl userService;
    private LoginServiceImpl loginService;
    private RegistrationServiceImpl registrationService;


    public Shop(List<Car> carList, List<User> userList, MenuDisplayServiceImpl MENU_DISPLAY_SERVICE,
                CustomerStatisticsImpl customerStatistics, CarFilterServiceImpl carFilterService,
                UserServiceImpl userService, LoginServiceImpl loginService,
                RegistrationServiceImpl registrationService) {
        this.carList = carList;
        this.userList = userList;
        this.MENU_DISPLAY_SERVICE = MENU_DISPLAY_SERVICE;
        this.customerStatistics = customerStatistics;
        this.carFilterService = carFilterService;
        this.userService = userService;
        this.loginService = loginService;
        this.registrationService = registrationService;
    }

    public void mainMenuController() {

        do {
            System.out.println();
            MENU_DISPLAY_SERVICE.displayMainMenu();
            System.out.println("If you don't have an account yet, register now for free!");
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // Registration
                    registrationService.initiateRegistration(loginService);
                    break;
                case 2: // Login
                    loginService.initiateLogIn();
                    if (loginService.isLoggedInAsSalesman(loginService.getLoggedInUser())) {
                        salesmanMenuController();
                    } else {
                        customerMenuController();
                    }
                    break;
                case 3: // Exit app
                    loginService.exitApp();
                default: // In case of picking a wrong option
                    System.out.println("Wrong option. Please, try again!");
                    break;
            }
        } while (!loginService.isLoggedIn(loginService.getLoggedInUser()));
    }

    public void customerMenuController() {
        String keyword;
        do {
            System.out.println();
            MENU_DISPLAY_SERVICE.displayCustomerMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // List all cars

                    break;
                case 2: // List available cars

                    break;
                case 3: // Filter by:
                    label1:
                    do {
                        System.out.println();
                        MENU_DISPLAY_SERVICE.displayCarFilterMenu();
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
                                carFilterService.filterByPrice(loginService.getLoggedInUser(), carList,
                                        0, 0);
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
                    } while (loginService.isLoggedInAsCustomer(loginService.getLoggedInUser()));
                    break;
                case 4: // Change Password
                    userService.changePassword(loginService.getLoggedInUser());
                    System.out.println(loginService.getLoggedInUser().toString()); //printare pentru testare
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
        } while (loginService.isLoggedInAsCustomer(loginService.getLoggedInUser()));
    }

    public void salesmanMenuController() {
        String keyword;
        do {
            System.out.println();
            MENU_DISPLAY_SERVICE.displaySalesmanMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // Manage Customers

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
        } while (loginService.isLoggedInAsSalesman(loginService.getLoggedInUser()));
    }

    public void manageCustomersSubMenu() {

    }

    public Car customerCarRenting() {
        System.out.println("Please, choose the car you want to rent: ");
        int index = INPUT.nextInt();

        return carList.get(index - 1);
    }

    public void doLogOut() {
        System.out.println("Log-out successfully!");
        loginService.setLoggedInUser(null);
        mainMenuController();
    }
}
