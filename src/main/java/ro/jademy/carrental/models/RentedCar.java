package ro.jademy.carrental.models;

import javax.xml.stream.Location;
import java.time.ZonedDateTime;

public class RentedCar {

    private ZonedDateTime pickUpDate;
    private ZonedDateTime returnDate;
    private Location pickUpLocation;
    private Location returnLocation;
    private boolean available;
    private boolean inMaintenance;
    private boolean inTransit;


    public RentedCar(ZonedDateTime pickUpDate, ZonedDateTime returnDate, Location pickUpLocation,
                     Location returnLocation, boolean available, boolean inMaintenance, boolean inTransit) {
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.pickUpLocation = pickUpLocation;
        this.returnLocation = returnLocation;
        this.available = available;
        this.inMaintenance = inMaintenance;
        this.inTransit = inTransit;
    }

    public ZonedDateTime getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(ZonedDateTime pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public ZonedDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(ZonedDateTime returnDate) {
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

    public boolean isInTransit() {
        return inTransit;
    }

    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }
}
