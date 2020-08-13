package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.users.Customer;
import java.util.List;

public interface CarFilterService {

    List<Car> getAllCars();
    List<Car> filterAllCarsByUser(Customer customer);
    Car filterCarByMake(String make);
    Car filterCarByModel(String model);
    Car filterCarByFabricationYear(int fabricationYear);
    Car filterCarByBaseRentPrice(int baseRentPrice);

}
