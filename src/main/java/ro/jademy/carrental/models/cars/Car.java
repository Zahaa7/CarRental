package ro.jademy.carrental.models.cars;

import org.apache.commons.lang3.StringUtils;
import ro.jademy.carrental.models.RentedCarHistory;


import java.util.Objects;

public class Car {

    //----- General properties that all cars have -----//

    private final String vinNumber;
    private String make;
    private String model;
    private String fuelType;              // diesel, gasoline, electric, hybrid;
    private String carType;               // coupe, sedan, hatchback, convertible, wagon, SUV
    private String color;                 // white, black, red etc.
    private String transmissionType;      // automatic, manual
    private String engine;                // TSI twin-charger, EcoBoost, V8 twin-turbo etc.
    private double mileage;
    private int horsePower;
    private int doorNumber;
    private int seatNumber;
    private int fabricationYear;
    private int baseRentPrice;
    private boolean rented = false;
    private RentedCarHistory carRentedHistory;

    public Car(String vinNumber, String make, String model, String fuelType, String carType, String color,
               String transmissionType, String engine, double mileage, int horsePower, int doorNumber, int seatNumber,
               int fabricationYear, int baseRentPrice) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.carType = carType;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.mileage = mileage;
        this.horsePower = horsePower;
        this.doorNumber = doorNumber;
        this.seatNumber = seatNumber;
        this.fabricationYear = fabricationYear;
        this.baseRentPrice = baseRentPrice;
        this.carRentedHistory = getCarRentedHistory();
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int getBaseRentPrice() {
        return baseRentPrice;
    }

    public void setBaseRentPrice(int baseRentPrice) {
        this.baseRentPrice = baseRentPrice;
    }

    public RentedCarHistory getCarRentedHistory() {
        return carRentedHistory;
    }

    @Override
    public String toString() {
        return  StringUtils.center(vinNumber, 14, " ") +
                StringUtils.center(make, 14, " ") +
                StringUtils.center(model, 16, " ") +
                StringUtils.center(fuelType, 14, " ") +
                StringUtils.center(carType, 14, " ") +
                StringUtils.center(color, 16, " ") +
                StringUtils.center(transmissionType, 14, " ") +
                StringUtils.center(engine, 14, " ") +
                StringUtils.center(String.valueOf(mileage), 14, ' ') +
                StringUtils.center(String.valueOf(horsePower), 14, " ") +
                StringUtils.center(String.valueOf(doorNumber), 10, ' ') +
                StringUtils.center(String.valueOf(seatNumber), 10, ' ') +
                StringUtils.center(String.valueOf(fabricationYear), 12, ' ') +
                StringUtils.center(String.valueOf(baseRentPrice), 20, " ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.mileage, mileage) == 0 &&
                horsePower == car.horsePower &&
                doorNumber == car.doorNumber &&
                seatNumber == car.seatNumber &&
                fabricationYear == car.fabricationYear &&
                baseRentPrice == car.baseRentPrice &&
                Objects.equals(vinNumber, car.vinNumber) &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(fuelType, car.fuelType) &&
                Objects.equals(carType, car.carType) &&
                Objects.equals(color, car.color) &&
                Objects.equals(transmissionType, car.transmissionType) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(carRentedHistory, car.carRentedHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumber, make, model, fuelType, carType, color, transmissionType, engine, mileage,
                horsePower, doorNumber, seatNumber, fabricationYear, baseRentPrice, carRentedHistory);
    }

    //----- General methods that all cars have -----///


    public void updateMileage(double mileageAmount) {

    }
}
