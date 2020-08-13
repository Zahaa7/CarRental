package ro.jademy.carrental.models.cars.rover;

import ro.jademy.carrental.models.cars.Car;

public class Rover extends Car {

    public Rover(String vinNumber, String model, String fuelType, String carType, String color,
                 String transmissionType, String engine, double mileage, int horsePower, int doorNumber, int seatNumber,
                 int fabricationYear, int baseRentPrice) {
        super(vinNumber, "Rover", model, fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
