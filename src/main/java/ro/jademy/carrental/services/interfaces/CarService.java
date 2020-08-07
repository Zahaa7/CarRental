package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.users.Customer;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();
    List<Car> getAllCarsByUser(Customer customer);
    Car getCarById(Long id);
    Car getCarByMake(String make);
    Car getCarByModel(String model);
    Car getCarByFabricationYear(int fabricationYear);

}
