package ro.jademy.carrental.services;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.RegistrationService;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RegistrationServiceImpl implements RegistrationService {

    private Scanner input = new Scanner(System.in);
    private List<User> userList;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public RegistrationServiceImpl(List<User> userList) {
        this.userList = userList;
    }


    @Override
    public Customer customerRegistrationForm(String firstName, String lastName, String userName, String password,
                                             String address, String gender, String birthDate, String licenceObtained,
                                             int accidentsNo, boolean membership) {
        return new Customer(firstName, lastName, userName, password, address, gender, birthDate, licenceObtained,
                accidentsNo, 0, membership);
    }

    @Override
    public void customerRegistration(Customer customer) {
        System.out.println("Registration complete!");
        userList.add(customer);
    }

    @Override
    public User salesmanRegistrationForm(String firstName, String lastName, String userName, String password) {
        return new Salesman(firstName, lastName, userName, password);
    }

    @Override
    public void salesmanRegistration(Salesman salesman) {
        System.out.println("Salesman registration complete!");
        userList.add(salesman);
    }

    @Override
    public void initiateRegistration(LoginServiceImpl loginService) {

            System.out.println();
            displayRegistrationMenu();
            System.out.println("First Name:");
            String firstName = input.next();
            System.out.println("Last Name:");
            String lastName = input.next();
            System.out.println("Username:");
            String userName = input.next();
            System.out.println("Password:");
            String password = input.next();
            if (loginService.validateInput(userName, password, firstName, lastName)) {
                System.out.println("Address:");
                String address = input.next();
                System.out.println("Gender:");
                String gender = input.next();
                System.out.println("BirthDate:  Format: [yyyy-MM-dd]");
                String birthDate = input.next();
                System.out.println("Licence obtained date:  Format: [yyyy-MM-dd]");
                String licenceObtained = input.next();
                try {
                    Date date1 = dateFormat.parse(String.valueOf(birthDate));
                    Date date2 = dateFormat.parse(String.valueOf(licenceObtained));
                    dateFormat = new SimpleDateFormat("EEE, yyyy MMM d");
                    System.out.println("Date: " + dateFormat.format(date1));
                    System.out.println("Date: " + dateFormat.format(date2));
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                }
                System.out.println("Number of accidents:");
                int accidentsNo = input.nextInt();
                System.out.println("Want to become a member for only $100/year? You'll receive more discounts! [Yes/No]");
                String hasMembershipInput = input.next();
                boolean membership = hasMembershipInput.equals("yes");

                customerRegistration(customerRegistrationForm(firstName, lastName,
                        userName, password, address, gender, birthDate, licenceObtained,
                        accidentsNo, membership));
            } else {
                System.out.println("Invalid format");
            }
        }

    @Override
    public void displayRegistrationMenu() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|                   REGISTER:                  |");
        System.out.println("+----------------------------------------------+");
    }

}
