package ro.jademy.carrental.models.cars.audi;

import ro.jademy.carrental.models.cars.Car;

public class Audi extends Car {

    public Audi(String vinNumber, String model, String fuelType, String carType, String color,
                String transmissionType, String engine, double mileage, int horsePower, int doorNumber, int seatNumber,
                int fabricationYear, int baseRentPrice) {
        super(vinNumber, "Audi", model, fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

