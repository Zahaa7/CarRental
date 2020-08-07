package ro.jademy.carrental.users;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.User;
import java.util.List;

public class Salesman extends User {

    private int id;
    private List<Car> newCarsBoughtList;

    public Salesman(String firstName, String lastName, String userName, String password,
                    int id, List<Car> newCarsBoughtList) {
        super(firstName, lastName, userName, password);
        this.id = id;
        this.newCarsBoughtList = newCarsBoughtList;
    }
}
