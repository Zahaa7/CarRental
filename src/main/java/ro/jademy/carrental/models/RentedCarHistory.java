package ro.jademy.carrental.models;

import ro.jademy.carrental.models.cars.Car;
import javax.xml.stream.Location;
import java.time.LocalDate;

public class RentedCarHistory {

    private Car rentedCar;
    private LocalDate pickUpDate;
    private LocalDate returnDate;
    private Location pickUpLocation;
    private Location returnLocation;
    private int rentalDays;
    private double amountPerDay;
    private double totalAmount;
    private boolean available;
    private boolean inMaintenance;

    public RentedCarHistory(Car rentedCar, LocalDate pickUpDate, Location pickUpLocation, Location returnLocation,
                            int rentalDays, double amountPerDay) {
        this.rentedCar = rentedCar;
        this.pickUpDate = pickUpDate;
        this.returnDate = pickUpDate.plusDays(rentalDays);
        this.pickUpLocation = pickUpLocation;
        this.returnLocation = returnLocation;
        this.rentalDays = rentalDays;
        this.amountPerDay = amountPerDay;
        this.totalAmount = amountPerDay * rentalDays;
        this.available = true;
        this.inMaintenance = false;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(Location returnLocation) {
        this.returnLocation = returnLocation;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getAmountPerDay() {
        return amountPerDay;
    }

    public void setAmountPerDay(double amountPerDay) {
        this.amountPerDay = amountPerDay;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isInMaintenance() {
        return inMaintenance;
    }

    public void setInMaintenance(boolean inMaintenance) {
        this.inMaintenance = inMaintenance;
    }

    @Override
    public String toString() {
        return "RentedCarHistory{" +
                "car=" + rentedCar +
                ", pickUpDate=" + pickUpDate +
                ", returnDate=" + returnDate +
                ", pickUpLocation=" + pickUpLocation +
                ", returnLocation=" + returnLocation +
                ", rentalDays=" + rentalDays +
                ", amountPerDay=" + amountPerDay +
                ", totalAmount=" + totalAmount +
                ", available=" + available +
                ", inMaintenance=" + inMaintenance +
                '}';
    }
}