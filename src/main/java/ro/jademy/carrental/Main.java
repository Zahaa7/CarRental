package ro.jademy.carrental;

import ro.jademy.carrental.services.LoginServiceImpl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        ro.jademy.carrental.data.UserDB userDB = new ro.jademy.carrental.data.UserDB();
        LoginServiceImpl loginService = new LoginServiceImpl(userDB.getAllUsers());
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your username:");
        String username = input.next();
        System.out.println("Please, enter your password:");
        String pass = input.next();
        loginService.doLogIn(username, pass);
        if (loginService.isLoggedInAsCustomer()) {
            System.out.println("Login successfully!!!");
        } else {
            System.out.println("Wring credentials!");
        }
    }
}
