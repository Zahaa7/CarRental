package ro.jademy.carrental.models.cars.mercedes;

import ro.jademy.carrental.models.cars.Car;

public class Mercedes extends Car {

    public Mercedes(String vinNumber, String model, String fuelType, String carType, String color,
                    String transmissionType, String engine, double mileage, int horsePower, int doorNumber,
                    int seatNumber, int fabricationYear, int baseRentPrice) {
        super(vinNumber, "Mercedes", model, fuelType, carType, color, transmissionType, engine, mileage,
                horsePower, doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
