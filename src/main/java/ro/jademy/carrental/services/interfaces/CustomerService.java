package ro.jademy.carrental.services.interfaces;

public interface CustomerService {

     void applyMembershipDiscount(); // only for membership pass


     void calculateFeePerDay(); // fee to paid for a certain car per day


     void calculateFee();  // fee to be paid for each rented car for more than one day

     void calculateCollisionDamageWaiver(); // mandatory service, in case of damage through an accident


     void calculateLossDamageWaiver();   // mandatory service, acts as theft protection
                                         // will cover car replacement if the rental car was stolen


     void calculatePenalties();
        // optional service, only charged for:
            /* - Missing fuel
               - Loss of car's documents / key / accessories
               - Damage of the hub
                   -> excessive dirt
                   -> staining of the seats or any kind of damage to the seats
                   -> scratches to the dashboard, wheel, shifter, console etc.
               - Damage of the inferior part of the vehicle (elements under the car)
                   -> shield
                   -> exhaust pipe/s
                   -> oil sump etc.
               - Wrong fuel supply of the vehicle
               - Deterioration of the rims & tyres
                   -> including flat tire/s
               - Partial/total deterioration caused as a result of smoking inside the car
               - Breaking or scratching the leather inside the vehicle
             */

    public void calculateAge();

    public void calculateExperience();

    public void calculateRentalCoeff();




}
