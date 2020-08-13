package ro.jademy.carrental.models.cars.audi;

public class A5 extends Audi{

    public A5(String vinNumber, String fuelType, String carType, String color, String transmissionType,
              String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
              int baseRentPrice) {
        super(vinNumber, "A5", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

