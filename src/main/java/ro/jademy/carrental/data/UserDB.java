package ro.jademy.carrental.data;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.users.Customer;
import ro.jademy.carrental.users.Salesman;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    User salesman_user01 = new Salesman("Sale1", "Salesman1", "salesman1", "0000");
    User salesman_user02 = new Salesman("Sale2", "Salesman2", "salesman2", "1234");
    User customer_user03 = new Customer("Ion", "Ionescu", "ion1", "ionescu1",
            "Str. Ionelilor", 25, true, LocalDate.of(2014, Month.DECEMBER, 10),
            LocalDate.of(2024, Month.DECEMBER, 10), null);
    User customer_user04 = new Customer("Ionica", "Ionascu", "ionica1", "ionascu1",
            "Str. Ionelilor", 18, false, LocalDate.of(2018, Month.JUNE, 16),
            LocalDate.of(2028, Month.JUNE, 16), null);
    User customer_user05 = new Customer("Nelu", "Nelutu", "nelu1", "nelutu1",
            "Str. Ionelilor", 45, true, LocalDate.of(2010, Month.OCTOBER, 26),
            LocalDate.of(2020, Month.OCTOBER, 26), null);

    public List<User> getAllUserList() {
        List<User> allUserList = new ArrayList<>();
        allUserList.add(salesman_user01);
        allUserList.add(salesman_user02);
        allUserList.add(customer_user03);
        allUserList.add(customer_user04);
        allUserList.add(customer_user05);

        return allUserList;
    }
}
