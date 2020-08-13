package ro.jademy.carrental.models.cars.bmw;


public class I3 extends BMW {

    public I3(String vinNumber, String fuelType, String carType, String color, String transmissionType, String engine,
              double mileage, int horsePower, int doorNumber, int seatNumber, int fabricationYear, int baseRentPrice) {
        super(vinNumber, "I3", fuelType, carType, color, transmissionType, engine, mileage, horsePower,
                doorNumber, seatNumber, fabricationYear, baseRentPrice);
    }
}

