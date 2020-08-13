package ro.jademy.carrental.models.cars.mercedes;


public class CLS extends Mercedes{

    public CLS(String vinNumber, String model, String fuelType, String carType, String color, String transmissionType,
               String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
               int baseRentPrice) {
        super(vinNumber, "CLS", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

