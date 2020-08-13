package ro.jademy.carrental.models.cars.audi;

public class R8 extends Audi{


    public R8(String vinNumber, String fuelType, String carType, String color, String transmissionType,
              String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
              int baseRentPrice) {
        super(vinNumber, "R8", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

