package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;

public interface LoginService {

    default User validateLogIn(String userName, String password) {
        return null;
    }

    default User doLogIn(String userName, String password) {
        return null;
    }

    default void doLogOut() {

    }

    default boolean isLoggedIn() {
        return false;
    }

    default boolean isLoggedInAsCustomer() {
        return false;
    }

    default boolean isLoggedInAsSalesman() {
        return false;
    }
}
