package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;

public interface LoginService {

    User validateLogIn(String userName, String password);

    User doLogIn(String userName, String password);

    void doLogOut();

    boolean isLoggedIn();

    boolean isLoggedInAsCustomer();

    boolean isLoggedInAsSalesman();

    boolean isValidUserName(String userName);

    boolean isValidPassword(String password);

    boolean isValidFirstName(String firstName);

    boolean isValidLastName(String lastName);

    void initiateLogIn();

    void displayLogInMenu();

    void exitApp();

}
