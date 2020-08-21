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
        int minInputBound;
        int maxInputBound;
        do {
            System.out.println();
            MENU_DISPLAY_SERVICE.displayCustomerMenu();
            System.out.println("Please, choose your option from down below: ");
            int option = INPUT.nextInt();
            switch (option) {
                case 1: // List all cars
                        showAllCars(carList);
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
                                System.out.println("Please, enter a make brand: " +
                                        "[Audi / BMW / Mercedes / Land-Rover / Range-Rover]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByMake(keyword));
                                break;
                            case 2: // Filter by model
                                System.out.println("Please, enter a model: " +
                                        "[A5/Q7/R8 / M5/X7/I3 / AMG/CLS/GLA / " +
                                        "\nDefender/Discovery/Freelander /" +
                                        "\nEvoque/Velar/Vogue]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByModel(keyword));
                                break;
                            case 3: // Filter by budget
                                System.out.println("Choose the price range!");
                                System.out.println("Starting at:");
                                minInputBound = INPUT.nextInt();
                                System.out.println("Ending at:");
                                maxInputBound = INPUT.nextInt();
                                showAllCars(carFilterService.filterByPrice(minInputBound, maxInputBound));
                                break;
                            case 4: // Filter by fuelType
                                System.out.println("Please, choose your favourite fuel-type: " +
                                        "[Petrol / Diesel / Electricity]:");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByFuelType(keyword));
                                break;
                            case 5: // Filter by color
                                System.out.println("Please, choose your favourite color: " +
                                        "[White / Black / Grey / Red / Blue / Green]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByColor(keyword));
                                break;
                            case 6: // Filter by engine
                                System.out.println("Please, choose your favourite engine: " +
                                        "[2.0L / 2.7L / 3.0L / 4.1L / 4.4L / 5.2L / Electric]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByEngine(keyword));
                                break;
                            case 7: // Filter by car-type
                                System.out.println("Please, choose your favourite engine: " +
                                        "[Sedan / Coupe / Cabriolet / SUV / Hatchback]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByCarType(keyword));
                                break;
                            case 8: // Filter by transmission-type
                                System.out.println("Please, choose your favourite transmission-type: " +
                                        "[Automatic / Manual / Single-speed]");
                                INPUT.skip("\n");
                                keyword = INPUT.nextLine().toUpperCase();
                                showAllCars(carFilterService.filterByTransmissionType(keyword));
                                break;
                            case 9: // Filter by fabrication-year
                                System.out.println("Choose the year range:");
                                System.out.println("Starting at:");
                                minInputBound = INPUT.nextInt();
                                System.out.println("Ending at:");
                                maxInputBound = INPUT.nextInt();
                                showAllCars(carFilterService.filterByFabricationYear(minInputBound, maxInputBound));
                                break;
                            case 10: // Return to previous menu
                                break label1;
                            case 11: // Logout
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

    public void showAllCars( List<Car> cars ) {
        System.out.println(MenuDisplayServiceImpl.getCarHeader());
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (!car.isRented()) {
                String padding = i < 9 ? " " : "";
                System.out.println(padding + (i + 1) + ". " + car);
            }
        }
    }

    public void doLogOut() {
        System.out.println("Log-out successfully!");
        loginService.setLoggedInUser(null);
        mainMenuController();
    }
}
