package ro.jademy.carrental.models.cars.bmw;

public class M5 extends BMW{

    public M5(String vinNumber, String fuelType, String carType, String color, String transmissionType,
              String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
              int baseRentPrice) {
        super(vinNumber, "M5", fuelType, carType, color, transmissionType, engine, mileage, horsePower, doorNumber,
                seatNumber, fabricationYear, baseRentPrice);
    }
}

