package ro.jademy.carrental.services;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.services.interfaces.CarFilterService;
import java.util.ArrayList;
import java.util.List;

public class CarFilterServiceImpl implements CarFilterService {

    private List<Car> carList;

    public CarFilterServiceImpl(List<Car> carList) {
        this.carList = carList;
    }


    @Override
    public List<Car> filterByMake(String make) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getMake().toLowerCase().contains(make.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Make not found.");
            return carList;
        } else {
            return tempCarList;

        }
    }

    @Override
    public List<Car> filterByModel(String model) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getModel().toLowerCase().contains(model.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Model not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByColor(String color) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().toLowerCase().contains(color.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Color not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByEngine(String engine) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngine().toLowerCase().contains(engine.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Engine not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByCarType(String carType) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getCarType().toLowerCase().contains(carType.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Car-type not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByFuelType(String fuelType) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getFuelType().toLowerCase().contains(fuelType.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Fuel-type not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByTransmissionType(String transmissionType) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getTransmissionType().toLowerCase().contains(transmissionType.toLowerCase())) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Transmission-type not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }
    @Override
    public List<Car> filterByFabricationYear(int minInputBound, int maxInputBound) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getFabricationYear() >= minInputBound && car.getFabricationYear() <= maxInputBound) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Fabrication-year not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }

    @Override
    public List<Car> filterByPrice(int minPriceBound, int maxPriceBound) {
        List<Car> tempCarList = new ArrayList<>();
        for (Car car : carList) {
            if ((car.getBaseRentPrice() >= minPriceBound
                    && car.getBaseRentPrice() <= maxPriceBound)) {
                tempCarList.add(car);
            }
        }
        if (tempCarList.isEmpty()) {
            System.out.println("Error 404! Price bound not found.");
            return carList;
        } else {
            return tempCarList;
        }
    }
}

