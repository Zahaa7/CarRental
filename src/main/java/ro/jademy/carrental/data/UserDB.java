package ro.jademy.carrental.data;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.models.users.Customer;
import ro.jademy.carrental.models.users.Salesman;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    public static List<User> getCustomerList() {
        List<User> customerList = new ArrayList<>();
        customerList.add(new Customer("Alex", "Zaha", "alex.z", "1111",
                "13 Septembrie, Sector 5", "Male", "1996-10-07", "2015-03-26",
                2, 0, false));
        customerList.add(new Customer("Monica", "Lazar", "monica.l", "2222",
                "13 Septembrie, Sector 5", "Female", "1997-10-06", "2017-06-15",
                0, 0, false));

        return customerList;
    }

    public static List<User> getAdminList() {
        List<User> adminList = new ArrayList<>();
        adminList.add(new Salesman("Admin", "Adminescu", "admin", "0000"));

        return adminList;
    }

    public static List<User> getAllUserList() {
        List<User> userList = getCustomerList();
        userList.addAll(getAdminList());

        return userList;
    }

    public static long getShopBalance() {
        return 0;
    }
}
