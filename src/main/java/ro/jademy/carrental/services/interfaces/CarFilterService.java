package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.cars.Car;
import java.util.List;

public interface CarFilterService {

    List<Car> getAllCars();
    List<Car> getAvailableCars();

    List<Car> filterByMake(String make);
    List<Car> filterByModel(String model);
    List<Car> filterByFuelType(String fuelType);
    List<Car> filterByPrice(int baseRentPrice);

    //TODO:
    //List<Car> filterByTransmissionType(String transmission);
    //List<Car> filterByColor(String color);


}
