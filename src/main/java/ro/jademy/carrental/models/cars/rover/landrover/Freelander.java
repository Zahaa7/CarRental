package ro.jademy.carrental.models.cars.rover.landrover;

import ro.jademy.carrental.models.cars.rover.Rover;

public class Freelander extends Rover {

    public Freelander(String vinNumber, String model, String fuelType, String carType, String color,
                      String transmissionType, String engine, double mileage, int horsePower, int doorNumber,
                      int seatNumber, int fabricationYear, int baseRentPrice) {
        super(vinNumber, "Freelander", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
