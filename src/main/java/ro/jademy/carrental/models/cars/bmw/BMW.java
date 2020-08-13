package ro.jademy.carrental.models.cars.bmw;

import ro.jademy.carrental.models.cars.Car;

public class BMW extends Car {

    public BMW(String vinNumber, String model, String fuelType, String carType, String color,
               String transmissionType, String engine, double mileage, int horsePower, int doorNumber, int seatNumber,
               int fabricationYear, int baseRentPrice) {
        super(vinNumber, "BMW", model, fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
