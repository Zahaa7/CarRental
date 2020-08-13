package ro.jademy.carrental.users;

import ro.jademy.carrental.models.RentedCarHistory;
import ro.jademy.carrental.models.User;

import java.time.LocalDate;
import java.util.List;

public class Customer extends User {

    private String address;
    private int age;
    private boolean membership;
    private LocalDate licenceObtained;
    private LocalDate licenceExpiration;
    private List<RentedCarHistory> rentedCarsHistory;

    public Customer(String firstName, String lastName, String userName, String password, String address, int age,
                    boolean membership, LocalDate licenceObtained, LocalDate licenceExpiration,
                    List<RentedCarHistory> rentedCarsHistory) {
        super(firstName, lastName, userName, password);
        this.address = address;
        this.age = age;
        this.membership = membership;
        this.licenceObtained = licenceObtained;
        this.licenceExpiration = licenceExpiration;
        this.rentedCarsHistory = rentedCarsHistory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public LocalDate getLicenceObtained() {
        return licenceObtained;
    }

    public void setLicenceObtained(LocalDate licenceObtained) {
        this.licenceObtained = licenceObtained;
    }

    public LocalDate getLicenceExpiration() {
        return licenceExpiration;
    }

    public void setLicenceExpiration(LocalDate licenceExpiration) {
        this.licenceExpiration = licenceExpiration;
    }

    public List<RentedCarHistory> getRentedCarsHistory() {
        return rentedCarsHistory;
    }

    public void setRentedCarsHistory(List<RentedCarHistory> rentedCarsHistory) {
        this.rentedCarsHistory = rentedCarsHistory;
    }
}
