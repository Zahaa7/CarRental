package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;

public interface LoginService {

    User validateLogIn(String userName, String password);

    User doLogIn(String userName, String password);

    boolean isLoggedIn(User loggedInUser);

    boolean isLoggedInAsCustomer(User loggedInUser);

    boolean isLoggedInAsSalesman(User loggedInUser);

    boolean isValidUserName(String userName);

    boolean isValidPassword(String password);

    boolean isValidFirstName(String firstName);

    boolean isValidLastName(String lastName);

    User initiateLogIn();

    void displayLogInMenu();

    void exitApp();


}
