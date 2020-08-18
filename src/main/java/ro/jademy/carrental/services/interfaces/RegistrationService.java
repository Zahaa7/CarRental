package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.RentedCarHistory;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

import java.time.LocalDate;
import java.util.List;

public interface RegistrationService {

    Customer customerRegistrationForm (String firstName, String lastName, String userName, String password, String address,
                                   LocalDate birthDate, boolean membership, LocalDate licenceObtained,
                                   LocalDate licenceExpiration, List<RentedCarHistory> rentedCarsHistory);

    void customerRegistration(Customer customer);


    User salesmanRegistrationForm (String firstName, String lastName, String userName, String password);

    void salesmanRegistration(Salesman salesman);

    void initiateRegistration();

    void displayRegistrationMenu();

}
