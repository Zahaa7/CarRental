package ro.jademy.carrental.services.interfaces;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.models.cars.Car;
import java.util.List;

public interface CarFilterService {

    List<Car> filterByMake(String make);
    List<Car> filterByModel(String model);
    List<Car> filterByFuelType(String fuelType);
    List<Car> filterByColor(String color);
    List<Car> filterByEngine(String engine);
    List<Car> filterByCarType(String carType);
    List<Car> filterByTransmissionType(String transmissionType);
    List<Car> filterByDoorNo(List<Car> carList, int minInputBound, int maxInputBound);
    List<Car> filterBySeatNo(List<Car> carList, int minInputBound, int maxInputBound);
    List<Car> filterByFabricationYear(List<Car> carList, int minInputBound, int maxInputBound);
    List<Car> filterByPrice(User user, List<Car> carList, int minPriceBound, int maxPriceBound);
}
