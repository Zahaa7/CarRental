package ro.jademy.carrental.data;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    public  List<User> getAllCustomers() {
        List<User> allCustomersList = new ArrayList<>();
        User customer_user01 = new Customer("User1", "Userescu1", "customer1", "1234",
                "Str. Ionelilor", LocalDate.of(1996, Month.OCTOBER, 7),
                true, LocalDate.of(2014, Month.DECEMBER, 10),
                LocalDate.of(2024, Month.DECEMBER, 10), null);
        User customer_user02 = new Customer("User2", "Userescu2", "customer2", "5678",
                "Str. Ionelilor", LocalDate.of(1990, Month.AUGUST, 23), false, LocalDate.of(2018, Month.JUNE, 16),
                LocalDate.of(2028, Month.JUNE, 16), null);
        User customer_user03 = new Customer("User3", "Userescu3", "customer3", "9012",
                "Str. Ionelilor", LocalDate.of(1971, Month.MARCH, 6), true, LocalDate.of(2010, Month.OCTOBER, 26),
                LocalDate.of(2020, Month.OCTOBER, 26), null);
        allCustomersList.add(customer_user01);
        allCustomersList.add(customer_user02);
        allCustomersList.add(customer_user03);

        return allCustomersList;
    }

    public  List<User> getAllSalesmen() {
        List<User> allSalesmen = new ArrayList<>();
        User salesman_user04 = new Salesman("Sale1", "Salesman1", "salesman1", "0000");
        allSalesmen.add(salesman_user04);

        return allSalesmen;
    }

    public  List<User> getAllUsers() {
        List<User> allUsersList = getAllCustomers();
        allUsersList.addAll(getAllSalesmen());

        return allUsersList;
    }
}
