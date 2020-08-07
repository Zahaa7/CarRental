package ro.jademy.carrental.services;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.interfaces.CarService;
import ro.jademy.carrental.users.Customer;
import java.util.List;

public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public List<Car> getAllCarsByUser(Customer customer) {
        return null;
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }

    @Override
    public Car getCarByMake(String make) {
        return null;
    }

    @Override
    public Car getCarByModel(String model) {
        return null;
    }

    @Override
    public Car getCarByFabricationYear(int fabricationYear) {
        return null;
    }
}
