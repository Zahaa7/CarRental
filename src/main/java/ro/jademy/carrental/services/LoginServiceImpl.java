package ro.jademy.carrental.services;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.LoginService;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;
import java.util.List;

public class LoginServiceImpl implements LoginService {

    private List<User> allUsersList;
    private Customer loggedAsCustomer;
    private Salesman loggedAsSalesman;

    public LoginServiceImpl(List<User> allUsersList) {
        this.allUsersList = allUsersList;
    }

    @Override
    public User validateLogIn(String userName, String password) {
        for (User user: allUsersList) {
            if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
              return user;
            }
        }
        return null;
    }

    @Override
    public User doLogIn(String userName, String password) {
        if (validateLogIn(userName, password) instanceof Customer) {
            loggedAsCustomer = (Customer) validateLogIn(userName, password);
            System.out.println("Welcome " + loggedAsCustomer.getFirstName() +
                    " " + loggedAsCustomer.getLastName() + "!");
        } else if (validateLogIn(userName, password) instanceof Salesman) {
            loggedAsSalesman = (Salesman) validateLogIn(userName, password);
            System.out.println("Welcome " + loggedAsSalesman.getFirstName() +
                    " " + loggedAsSalesman.getLastName() + "!");
        }
        return null;
    }

    @Override
    public void doLogOut() {
        System.out.println("You have successfully logged out. Goodbye!");
        loggedAsCustomer = null;
        loggedAsSalesman = null;
    }

    @Override
    public boolean isLoggedIn() {
        return loggedAsCustomer != null;
    }

    @Override
    public boolean isLoggedInAsCustomer() {
        return isLoggedIn() && !loggedAsCustomer.getUserName().equals("salesman1");
    }

    @Override
    public boolean isLoggedInAsSalesman() {
        return isLoggedIn() && loggedAsSalesman.getUserName().equals("salesman1");
    }
}
