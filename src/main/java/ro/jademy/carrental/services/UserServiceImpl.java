package ro.jademy.carrental.services;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;
import ro.jademy.carrental.services.interfaces.UserService;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private Scanner input = new Scanner(System.in);
    private List<User> userList;

    public UserServiceImpl(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public Customer searchCustomer(String lastName) {
        for (User customer: userList) {
            if (lastName.equalsIgnoreCase(customer.getLastName())) {
                return (Customer) customer;
            }
        }
        return null;
    }

    @Override
    public Salesman searchSalesman(String lastName) {
        for (User salesman: userList) {
            if (lastName.equalsIgnoreCase(salesman.getLastName())) {
                return (Salesman) salesman;
            }
        }
        return null;
    }

    @Override
    public void displayAllCustomers() {
        for (User userList : userList) {
            System.out.println(userList.toString());
        }
    }

    @Override
    public boolean searchPassword() {
        System.out.println("Please, type your current password:");
        String oldPassword = input.nextLine();
        for (User customer: userList) {
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
            String newPassword = input.nextLine();
            loggedInUser.setPassword(newPassword);
            System.out.println("Password changed successfully!");
            System.out.println(loggedInUser);
        } else {
            System.out.println("Wrong password!");
        }
    }

    @Override
    public void deleteCustomerAccount(Customer customer) {
        System.out.println("Customer's account deleted successfully!");
        userList.remove(customer);
    }

    @Override
    public void deleteSalesmanAccount(Salesman salesman) {
        System.out.println("Salesman's account deleted successfully!");
        userList.remove(salesman);
    }
}
