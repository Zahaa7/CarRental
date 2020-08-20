package ro.jademy.carrental.users;

import ro.jademy.carrental.models.ExtraFeatures;
import ro.jademy.carrental.models.RentedCarHistory;
import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.CustomerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends User implements CustomerService {

    private Scanner input = new Scanner(System.in);

    private int age;
    private int rentalDays;
    private int drivingYears;
    private int accidentsNo;
    private double rentalCoeff;
    private String gender;
    private String address;
    private boolean membership;
    private LocalDate birthDate;
    private LocalDate licenceObtained;
    private List<RentedCarHistory> currentRentedCar = new ArrayList<>();
    private List<RentedCarHistory> carsRentedHistory = new ArrayList<>();

    public Customer() {

    }

    public Customer(String firstName, String lastName, String userName, String password, String address, String gender,
                    String birthDate, String licenceObtained, int accidentsNo, int rentalDays, boolean membership) {
        super(firstName, lastName, userName, password);
        this.address = address;
        this.gender = gender;
        this.birthDate = LocalDate.parse(birthDate);
        this.licenceObtained = LocalDate.parse(licenceObtained);
        this.accidentsNo = accidentsNo;
        this.rentalDays = rentalDays;
        this.membership = membership;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public int getDrivingYears() {
        return drivingYears;
    }

    public void setDrivingYears(int drivingYears) {
        this.drivingYears = drivingYears;
    }

    public int getAccidentsNo() {
        return accidentsNo;
    }

    public void setAccidentsNo(int accidentsNo) {
        this.accidentsNo = accidentsNo;
    }

    public double getRentalCoeff() {
        return rentalCoeff;
    }

    public void setRentalCoeff(double rentalCoeff) {
        this.rentalCoeff = rentalCoeff;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getLicenceObtained() {
        return licenceObtained;
    }

    public void setLicenceObtained(LocalDate licenceObtained) {
        this.licenceObtained = licenceObtained;
    }

    public List<RentedCarHistory> getCurrentRentedCar() {
        return currentRentedCar;
    }

    public void setCurrentRentedCar(List<RentedCarHistory> currentRentedCar) {
        this.currentRentedCar = currentRentedCar;
    }

    public List<RentedCarHistory> getCarsRentedHistory() {
        return carsRentedHistory;
    }

    public void setCarsRentedHistory(List<RentedCarHistory> carsRentedHistory) {
        this.carsRentedHistory = carsRentedHistory;
    }

    public List<ExtraFeatures> rentExtraFeatures(List<ExtraFeatures> extraFeatures, int... extraFeaturesIndices) {
        List<ExtraFeatures> rentedExtraFeatures = new ArrayList<>();
        for (int i = 0; i < extraFeaturesIndices.length; i++) {
            rentedExtraFeatures.add(extraFeatures.get(i));
        }
        return rentedExtraFeatures;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "firsName" + firstName +
                "lastName" + lastName +
                "userName" + userName +
                "age=" + age +
                ", rentalDays=" + rentalDays +
                ", drivingYears=" + drivingYears +
                ", accidentsNo=" + accidentsNo +
                ", rentalCoeff=" + rentalCoeff +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", membership=" + membership +
                ", birthDate=" + birthDate +
                ", licenceObtained=" + licenceObtained +
                ", currentRentedCar=" + currentRentedCar +
                ", carsRentedHistory=" + carsRentedHistory +
                '}';
    }

    @Override
    public void applyMembershipDiscount() {

    }

    @Override
    public void calculateFeePerDay() {

    }

    @Override
    public void calculateFee() {

    }

    @Override
    public void calculateCollisionDamageWaiver() {

    }

    @Override
    public void calculateLossDamageWaiver() {

    }

    @Override
    public void calculatePenalties() {

    }

    @Override
    public void calculateAge() {
        int result = LocalDate.now().getYear() - birthDate.getYear();
        setAge(result);
    }

    @Override
    public void calculateExperience() {
        int result = LocalDate.now().getYear() - licenceObtained.getYear();
       setDrivingYears(result);
    }

    @Override
    public void calculateRentalCoeff() {
        double baseCoeff = 1;
        double coeff = 0;
        int ageLimit = 25;             // no discount applied before 25 yo
        double ageRatio = 0.5;         // 0.5% discount/year applied after 25 yo
        double accidentRatio = 20;     // 20% tax rent/accident
        double drivingYearsRatio = 1;  // 1% discount/year driven experience
        double rentalDaysRatio = 0.1;  // 1% discount/10 days rented

        if (gender.equalsIgnoreCase("male")) {
            baseCoeff = baseCoeff * 1.0;
        } else if (gender.equalsIgnoreCase("female")) {
            baseCoeff = baseCoeff * 1.2;
        } else {
            System.out.println("Unfortunately, we don't rent to hermaphrodits!");
        }
        double accidentCoeff = accidentsNo * accidentRatio;
        double ageCoeff = 1;
        if (age <= ageLimit) {
            ageCoeff = 0;
        } else {
            ageCoeff = -age * ageRatio;
        }
        double drivingYearsCoeff = -drivingYears * drivingYearsRatio;
        double rentalDaysCoeff = -rentalDays * rentalDaysRatio;
        coeff = accidentCoeff + ageCoeff + drivingYearsCoeff + rentalDaysCoeff;
        double finalCoeff = baseCoeff * ((coeff / 100) * baseCoeff);
        setRentalCoeff(finalCoeff);
    }
}
