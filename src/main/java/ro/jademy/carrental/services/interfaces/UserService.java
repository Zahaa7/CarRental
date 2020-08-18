package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

public interface UserService {

    Customer searchCustomer(String lastName);

    Salesman searchSalesman(String lastName);

    void displayAllCustomers();

    boolean searchPassword();

    void changePassword(User loggedInUser);

    void deleteCustomerAccount(Customer customer);

    void deleteSalesmanAccount(Salesman salesman);

}
