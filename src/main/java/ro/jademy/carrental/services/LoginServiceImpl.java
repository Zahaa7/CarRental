package ro.jademy.carrental.services;

import ro.jademy.carrental.data.UserDB;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.LoginService;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginServiceImpl implements LoginService {

    private List<User> allUsersList;
    private User loggedInUser;
    private static Scanner input = new Scanner(System.in);
    UserDB userDB = new UserDB();

    public LoginServiceImpl() {

    }
    public LoginServiceImpl(UserDB userDB) {
        this.userDB = userDB;
    }

    @Override
    public User validateLogIn(String userName, String password) {
        for (User user: userDB.getAllUsers()) {
            if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
              return user;
            }
        }
        return null;
    }

    @Override
    public User doLogIn(String userName, String password) {
        if (validateLogIn(userName, password) instanceof Customer) {
            loggedInUser = validateLogIn(userName, password);
            System.out.println("Welcome " + loggedInUser.getFirstName() +
                    " " + loggedInUser.getLastName() + "!");
        } else if (validateLogIn(userName, password) instanceof Salesman) {
            loggedInUser = validateLogIn(userName, password);
            System.out.println("Welcome " + loggedInUser.getFirstName() +
                    " " + loggedInUser.getLastName() + "!");
        }
        return null;
    }

    @Override
    public void doLogOut() {
        System.out.println("You have successfully logged out. Goodbye!");
        loggedInUser = null;
    }

    @Override
    public void exitApp() {
        System.out.println("We're sorry you're leaving. Hope you'll be back soon!");
        System.exit(0);
    }

    @Override
    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    @Override
    public boolean isLoggedInAsCustomer() {
        return isLoggedIn() && !loggedInUser.getUserName().equals("customer");
    }

    @Override
    public boolean isLoggedInAsSalesman() {
        return isLoggedIn() && loggedInUser.getUserName().equals("salesman1");
    }

    @Override
    public boolean isValidUserName(String userName) {
        String regex = "^[aA-zZ]\\w{5,29}$";
    /*
          -> ^ represents starting character of the string.
          -> [aA-zZ] makes sure that the starting character is in the lowercase or uppercase alphabet.
          -> \\w{5,29} represents a check to make sure that the remaining items are word items, which includes the
          -> underscore, until it reaches the end and that is represented with $.
          -> {5, 29} checks that the 6-30 character constraint given to us minus the predefined first character.
          -> $ represents the end of the string.
    */
        Pattern pattern = Pattern.compile(regex);
        if (userName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

    @Override
    public boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
    /*
          -> ^ represents starting character of the string.
          -> (?=.*[0-9]) represents a digit must occur at least once.
          -> (?=.*[a-z]) represents a lower case alphabet must occur at least once.
          -> (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
          -> (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
          -> (?=\\S+$) white spaces don’t allowed in the entire string.
          -> .{8, 20} represents at least 8 characters and at most 20 characters.
          -> $ represents the end of the string.
    */
        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    @Override
    public boolean isValidFirstName(String firstName) {
        String regex = "(?i)(^[A-Z])" +
                "((?![ .,'-]$)" +
                "[a-z .,'-]){0,23}$";
    /*
          -> (?i) ignore case.
          -> (?i)[A-Z] can only start with an a-z character.
          -> (?i)[a-z](.*[a-z])? can only end with an a-z.
          -> (?i)[a-z](.{0,23}  is between 1 and 25 characters.
          -> (?i)[a-z]([- ',.a-z]{0,23}$ can contain a-z and [ '-,.].
    */
        Pattern pattern = Pattern.compile(regex);
        if (firstName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    @Override
    public boolean isValidLastName(String lastName) {
        String regex = "^[\\p{L}\\s.’\\-,]+$";
        Pattern pattern = Pattern.compile(regex);
        if (lastName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    @Override
    public void initiateLogIn() {

        do {
            System.out.println("");
            displayLogInMenu();
            System.out.println("Username:");
            String userName = input.nextLine();
            System.out.println("Password:");
            String password = input.nextLine();
            doLogIn(userName, password);
            if (isLoggedInAsCustomer() || isLoggedInAsSalesman()) {
                System.out.println("Login successfully!!!");
            } else {
                System.out.println("Wrong credentials! Please, try again!");
            }
        } while (!isLoggedIn());
    }

    @Override
    public void displayLogInMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|                     LOGIN:                   |");
        System.out.println(" -----------------------------------------------");
    }
}
