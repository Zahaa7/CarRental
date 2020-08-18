package ro.jademy.carrental.services;

import ro.jademy.carrental.data.UserDB;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;
import ro.jademy.carrental.services.interfaces.UserService;

public class UserServiceImpl implements UserService {

    private UserDB userDB = new UserDB();
    private LoginServiceImpl loginService = new LoginServiceImpl();

    @Override
    public Customer searchCustomer(String lastName) {
        for (User customer: userDB.getAllCustomers()) {
            if (lastName.equalsIgnoreCase(customer.getLastName())) {
                return (Customer) customer;
            }
        }
        return null;
    }

    @Override
    public Salesman searchSalesman(String lastName) {
        for (User salesman: userDB.getAllSalesmen()) {
            if (lastName.equalsIgnoreCase(salesman.getLastName())) {
                return (Salesman) salesman;
            }
        }
        return null;
    }

    @Override
    public void displayAllCustomers() {
        for (User userList : userDB.getAllCustomers()) {
            System.out.println(userList.toString());
        }
    }

    @Override
    public boolean searchPassword() {
        System.out.println("Please, type your current password:");
        String oldPassword = loginService.input.nextLine();
        for (User customer: userDB.getAllCustomers()) {
            if (oldPassword.equalsIgnoreCase(customer.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void changePassword(User loggedInUser) {
        if (searchPassword()) {
            System.out.println("Type in the new password:");
            String newPassword = loginService.input.nextLine();
            loggedInUser.setPassword(newPassword);
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Wrong password!");
        }
    }

    @Override
    public void deleteCustomerAccount(Customer customer) {
        System.out.println("Customer's account deleted successfully!");
        userDB.getAllCustomers().remove(customer);
    }

    @Override
    public void deleteSalesmanAccount(Salesman salesman) {
        System.out.println("Salesman's account deleted successfully!");
        userDB.getAllSalesmen().remove(salesman);
    }
}
