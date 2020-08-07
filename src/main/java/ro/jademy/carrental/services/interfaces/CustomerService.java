package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.users.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomersByFirstName(String firstName);
    Customer getCustomerByLastName(String lastName);
    Customer getCustomerByUserName(String userName);
}
