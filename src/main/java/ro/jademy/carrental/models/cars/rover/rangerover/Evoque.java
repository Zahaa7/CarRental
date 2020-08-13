package ro.jademy.carrental.models.cars.rover.rangerover;

import ro.jademy.carrental.models.cars.rover.Rover;

public class Evoque extends Rover {

    public Evoque(String vinNumber, String fuelType, String carType, String color,
                  String transmissionType, String engine, double mileage, int horsePower, int doorNumber,
                  int seatNumber, int fabricationYear, int baseRentPrice) {
        super(vinNumber, "Evoque", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
