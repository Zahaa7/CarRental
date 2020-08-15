package ro.jademy.carrental.services;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.interfaces.CarFilterService;
import ro.jademy.carrental.users.Customer;
import java.util.List;

public class CarFilterServiceImpl implements CarFilterService {


    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public List<Car> filterAllCarsByUser(Customer customer) {
        return null;
    }

    @Override
    public Car filterCarByMake(String make) {
        return null;
    }

    @Override
    public Car filterCarByModel(String model) {
        return null;
    }

    @Override
    public Car filterCarByFuelType(String fuelType) {
        return null;
    }

    @Override
    public Car filterCarByBaseRentPrice(int baseRentPrice) {
        return null;
    }
}
