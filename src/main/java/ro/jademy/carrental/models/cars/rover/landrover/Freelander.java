package ro.jademy.carrental.models.cars.rover.landrover;

import ro.jademy.carrental.models.RentedCarHistory;
import ro.jademy.carrental.models.cars.rover.Rover;

public class Freelander extends Rover {

    public Freelander(String vinNumber, String make, String model, String fuelType, String carType, String color,
                      String transmissionType, String engine, double mileage, int doorNumber, int seatNumber,
                      int fabricationYear, int rentPrice, RentedCarHistory carRented) {
        super(vinNumber, make, model, fuelType, carType, color, transmissionType, engine, mileage, doorNumber,
                seatNumber, fabricationYear, rentPrice, carRented);
    }
}
