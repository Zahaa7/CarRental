package ro.jademy.carrental.models.cars;

import ro.jademy.carrental.models.RentedCar;

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
    private int doorNumber;
    private int seatNumber;
    private int fabricationYear;
    private int rentPrice;
    private RentedCar carRented;

    public Car(String vinNumber, String make, String model, String fuelType, String carType, String color,
               String transmissionType, String engine, double mileage, int doorNumber, int seatNumber,
               int fabricationYear, int rentPrice, RentedCar carRented) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.carType = carType;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.mileage = mileage;
        this.doorNumber = doorNumber;
        this.seatNumber = seatNumber;
        this.fabricationYear = fabricationYear;
        this.rentPrice = rentPrice;
        this.carRented = carRented;
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

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public RentedCar getCarRented() {
        return carRented;
    }

    public void setCarRented(RentedCar carRented) {
        this.carRented = carRented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fabricationYear=" + fabricationYear +
                '}';
    }

    //----- General methods that all cars have -----///


    public void updateMileage(double mileageAmount) {

    }




}
