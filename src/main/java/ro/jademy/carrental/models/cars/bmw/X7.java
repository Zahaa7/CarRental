package ro.jademy.carrental.models.cars.bmw;

public class X7 extends BMW {

    public X7(String vinNumber, String fuelType, String carType, String color, String transmissionType,
              String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
              int baseRentPrice) {
        super(vinNumber, "X7", fuelType, carType, color, transmissionType, engine, mileage, horsePower, doorNumber,
                seatNumber, fabricationYear, baseRentPrice);
    }
}

