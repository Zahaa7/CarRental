package ro.jademy.carrental.models.cars;

import ro.jademy.carrental.models.RentedCarHistory;

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
    // private boolean gps;
    // private boolean ac;
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
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                ", color='" + color + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", engine='" + engine + '\'' +
                ", mileage=" + mileage +
                ", horsePower=" + horsePower +
                ", doorNumber=" + doorNumber +
                ", seatNumber=" + seatNumber +
                ", fabricationYear=" + fabricationYear +
                ", baseRentPrice=" + baseRentPrice +
                ", carRentedHistory=" + carRentedHistory +
                '}';
    }

    //----- General methods that all cars have -----///


    public void updateMileage(double mileageAmount) {

    }

}
