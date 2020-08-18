package ro.jademy.carrental.services;

import ro.jademy.carrental.data.UserDB;
import ro.jademy.carrental.models.RentedCarHistory;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.RegistrationService;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class RegistrationServiceImpl implements RegistrationService {

    UserDB userDB = new UserDB();
    LoginServiceImpl loginService = new LoginServiceImpl();
    Scanner input = new Scanner(System.in);

    public RegistrationServiceImpl() {

    }

    public RegistrationServiceImpl(List<User> allCustomers, List<User> allSalesmen) {
    }

    @Override
    public Customer customerRegistrationForm(String firstName, String lastName, String userName, String password,
                                             String address, LocalDate birthDate, boolean membership,
                                             LocalDate licenceObtained, LocalDate licenceExpiration,
                                             List<RentedCarHistory> rentedCarsHistory) {
        return new Customer(firstName, lastName, userName, password, address, birthDate, false,
                licenceObtained, licenceExpiration, null);
    }

    @Override
    public void customerRegistration(Customer customer) {
        System.out.println("Registration complete!");
        userDB.getAllCustomers().add(customer);
    }

    @Override
    public User salesmanRegistrationForm(String firstName, String lastName, String userName, String password) {
        return new Salesman(firstName, lastName, userName, password);
    }

    @Override
    public void salesmanRegistration(Salesman salesman) {
        System.out.println("Salesman registration complete!");
        userDB.getAllSalesmen().add(salesman);
    }

    @Override
    public void initiateRegistration() {
        Customer customer = null;
        do {
            System.out.println("");
            displayRegistrationMenu();
            System.out.println("First Name:");
            String firstName = input.next();
            System.out.println("Last Name:");
            String lastName = input.next();
            System.out.println("Username:");
            String userName = input.next();
            System.out.println("Password:");
            String password = input.next();
            System.out.println("BirthDate:");
            LocalDate birthDate = LocalDate.parse(input.nextLine());
            System.out.println("Licence obtained date:");
            LocalDate licenceObtained = LocalDate.parse(input.nextLine());
            System.out.println("Licence expiration date:");
            LocalDate licenceExpiration = LocalDate.parse(input.nextLine());
            System.out.println("Want a membership bundle pass? You'll receive more discounts!");
            boolean membership = input.nextBoolean();
            System.out.println("Address:");
            String address = input.nextLine();
            customer = customerRegistrationForm(firstName, lastName,
                    userName, password, address, birthDate, membership, licenceObtained, licenceExpiration,
                    null);
            customerRegistration(customer);
        } while (!loginService.isLoggedIn(customer));
    }

    @Override
    public void displayRegistrationMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|                   REGISTER:                  |");
        System.out.println(" -----------------------------------------------");
    }

}
