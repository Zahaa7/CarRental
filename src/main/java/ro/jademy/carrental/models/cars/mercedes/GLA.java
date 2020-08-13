package ro.jademy.carrental.models.cars.mercedes;

public class GLA extends Mercedes {

    public GLA(String vinNumber, String model, String fuelType, String carType, String color, String transmissionType,
               String engine, double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear,
               int baseRentPrice) {
        super(vinNumber, "GLA", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}
