package ro.jademy.carrental.services;

import ro.jademy.carrental.models.User;
import ro.jademy.carrental.services.interfaces.CustomerService;
import ro.jademy.carrental.users.Customer;
import java.time.LocalDate;

public class CustomerServiceImpl implements CustomerService {

    private Customer customer;

    public CustomerServiceImpl(Customer customer) {
        this.customer = customer;
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
        int result = LocalDate.now().getYear() - customer.getBirthDate().getYear();
        customer.setAge(result);
    }

    @Override
    public void calculateExperience() {
        int result = LocalDate.now().getYear() - customer.getLicenceObtained().getYear();
        customer.setDrivingYears(result);
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

        if (customer.getGender().equalsIgnoreCase("male")) {
            baseCoeff = baseCoeff * 1.0;
        } else if (customer.getGender().equalsIgnoreCase("female")) {
            baseCoeff = baseCoeff * 1.2;
        } else {
            System.out.println("Unfortunately, we don't rent to hermaphrodits!");
        }
        double accidentCoeff = customer.getAccidentsNo() * accidentRatio;
        double ageCoeff = 1;
        if (customer.getAge() <= ageLimit) {
            ageCoeff = 0;
        } else {
            ageCoeff = -customer.getAge() * ageRatio;
        }
        double drivingYearsCoeff = -customer.getDrivingYears() * drivingYearsRatio;
        double rentalDaysCoeff = -customer.getRentalDays() * rentalDaysRatio;
        coeff = accidentCoeff + ageCoeff + drivingYearsCoeff + rentalDaysCoeff;
        double finalCoeff = baseCoeff * ((coeff / 100) * baseCoeff);
        customer.setRentalCoeff(finalCoeff);
    }
}
