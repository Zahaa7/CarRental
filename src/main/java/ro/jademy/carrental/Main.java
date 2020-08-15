package ro.jademy.carrental;


import ro.jademy.carrental.services.LoginServiceImpl;
import ro.jademy.carrental.services.MenuDisplayServiceImpl;
import ro.jademy.carrental.services.interfaces.LoginService;

public class Main {

    public static void main(String[] args) {

        LoginServiceImpl loginService = new LoginServiceImpl();
        MenuDisplayServiceImpl menuDisplayService = new MenuDisplayServiceImpl();
        loginService.initiateLogIn();
        menuDisplayService.displayMainMenu();
    }
}
