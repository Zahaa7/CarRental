package ro.jademy.carrental.services;

import ro.jademy.carrental.data.AutoFleet;
import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.interfaces.CarFilterService;

import java.util.ArrayList;
import java.util.List;

public class CarFilterServiceImpl implements CarFilterService {

    AutoFleet autoFleet = new AutoFleet();


    @Override
    public List<Car> getAllCars() {
        for (Car car : autoFleet.getAllCarList()) {
            System.out.println(car.toString());
        }
        return null;
    }

    @Override
    public List<Car> getAvailableCars() {
        return null;
    }

    @Override
    public List<Car> filterByMake(String make) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getMake().toLowerCase().contains(make.toLowerCase())) {
                tempCarList.add(car);
                System.out.println(car.toString());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - make not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByModel(String model) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getModel().toLowerCase().contains(model.toLowerCase())) {
                tempCarList.add(car);
                System.out.println(car.toString());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - model not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByFuelType(String fuelType) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getFuelType().toLowerCase().contains(fuelType.toLowerCase())) {
                tempCarList.add(car);
                System.out.println(car.toString());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - fuel type not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByPrice(int baseRentPrice) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getBaseRentPrice() == baseRentPrice) {
                tempCarList.add(car);
                System.out.println(car.toString());
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - price not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    }

    /*@Override
    public List<Car> filterByTransmissionType(String transmission) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getTransmissionType().toLowerCase().contains(transmission.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - transmission type not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByColor(String color) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : autoFleet.getAllCarList()) {
            if (car.getColor().toLowerCase().contains(color.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404 - color not found!");
            return autoFleet.getAllCarList();
        } else {
            return tempCarList;
        }
    } */
}
