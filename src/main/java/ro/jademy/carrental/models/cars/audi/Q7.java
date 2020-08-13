package ro.jademy.carrental.models.cars.audi;

public class Q7 extends Audi{

    public Q7(String vinNumber, String fuelType, String carType, String color, String transmissionType,
              String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
              int baseRentPrice) {
        super(vinNumber, "Q7", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

