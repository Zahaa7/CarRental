package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.LoginServiceImpl;
import ro.jademy.carrental.models.users.Customer;
import ro.jademy.carrental.models.users.Salesman;

public interface RegistrationService {

    Customer customerRegistrationForm (String firstName, String lastName, String userName, String password,
                                       String address, String gender, String birthDate, String licenceObtained,
                                       int accidentsNo, boolean membership);

    void customerRegistration(Customer customer);


    User salesmanRegistrationForm (String firstName, String lastName, String userName, String password);

    void salesmanRegistration(Salesman salesman);

    void initiateRegistration(LoginServiceImpl loginService);

    void displayRegistrationMenu();

}
