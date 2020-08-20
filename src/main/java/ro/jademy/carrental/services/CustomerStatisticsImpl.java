package ro.jademy.carrental.services;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.CustomerStatistics;

import java.util.List;

public class CustomerStatisticsImpl implements CustomerStatistics {

    private List<User> userList;
    public CustomerStatisticsImpl(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void getCustomerStatistics() {

    }
}
