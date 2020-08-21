package ro.jademy.carrental;

import ro.jademy.carrental.data.AutoFleet;
import ro.jademy.carrental.data.UserDB;
import ro.jademy.carrental.models.Shop;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.addAll(UserDB.getAdminList());
        users.addAll(UserDB.getCustomerList());
        List<Car> cars = new ArrayList<>();
        cars.addAll(AutoFleet.getAllCarList());

        MenuDisplayServiceImpl menuDisplayService = new MenuDisplayServiceImpl();
        CustomerStatisticsImpl customerStatistics = new CustomerStatisticsImpl(users);
        CarFilterServiceImpl carFilterService = new CarFilterServiceImpl(cars);
        UserServiceImpl userService = new UserServiceImpl(users);
        RegistrationServiceImpl registrationService= new RegistrationServiceImpl(users);
        LoginServiceImpl loginService = new LoginServiceImpl(users);

        Shop shop = new Shop(cars,users, menuDisplayService, customerStatistics, carFilterService, userService,
                loginService, registrationService);
        shop.mainMenuController();
    }
}
