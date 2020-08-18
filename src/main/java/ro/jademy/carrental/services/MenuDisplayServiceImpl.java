package ro.jademy.carrental.services;

import ro.jademy.carrental.services.interfaces.MenuDisplayService;

public class MenuDisplayServiceImpl implements MenuDisplayService {

    @Override
    public void displayMainMenu() { // Main menu
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    @Override
    public void displaySalesmanMenu() { // Salesman/Shop's Main Menu - used as controller for users & auto fleet
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                  SALESMAN MENU                 ");
        System.out.println("1. Manage Customers");
        System.out.println("2. Manage Auto Fleet");
        System.out.println("3. Log-out");
        System.out.println("4. Exit");
    }

    @Override
    public void displayCustomerMenu() { // A customer Menu
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                  CUSTOMER MENU                 ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. Filter by:");
        System.out.println("4. Change Password");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    @Override
    public void displayCarFilterMenu() { // A customer filter sub-menu (Search by:)
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    FILTER MENU                   ");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        System.out.println("4. Filter by fuel-type");
        System.out.println("5. Back");
        System.out.println("6. Logout");
    }

    @Override
    public void displayCustomerFilterMenu() { // A 'Manage Customers' sub-menu for salesmen
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    FILTER MENU                   ");
        System.out.println("1. Access data on Customers");
        System.out.println("2. Customer Statistics");
        System.out.println("3. Delete Customer Account");
        System.out.println("4. Delete Salesman Account");
        System.out.println("5. Back");
        System.out.println("6. Logout");
    }

    @Override
    public void displayManageAutoFleetMenu() {// A 'Manage Auto Fleet' sub-menu for salesmen
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the ZAH's Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    FILTER MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }
}
