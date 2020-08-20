package ro.jademy.carrental.data;

import ro.jademy.carrental.models.cars.Car;
import ro.jademy.carrental.models.cars.audi.A5;
import ro.jademy.carrental.models.cars.audi.Q7;
import ro.jademy.carrental.models.cars.audi.R8;
import ro.jademy.carrental.models.cars.bmw.I3;
import ro.jademy.carrental.models.cars.bmw.M5;
import ro.jademy.carrental.models.cars.bmw.X7;

import java.util.ArrayList;
import java.util.List;

public class AutoFleet {

    public static List<Car> getAllCarList() {
        Car audiA5_01 = new A5("WAUJGCFC0E0010891", "Diesel", "Cabriolet", "White",
                "Automatic", "2.7L", 3.302, 220, 2, 2,
                2007, 239);
        Car audiA5_02 = new A5("WAUZZZ8T09A041586", "Diesel", "Coupe", "Red",
                "Manual", "2.7", 2.999, 163, 2, 2,
                2009, 229);
        Car audiA5_03 = new A5("WAULC68E54AO20748", "Petrol", "Coupe", "Grey",
                "Automatic", "2.0L", 1.232, 180, 2, 2,
                2018, 249);
        Car audiQ7_01 = new Q7("WAUZZZ4L08D008980", "Diesel", "SUV", "Black",
                "Automatic", "4.1L", 3.671, 370, 5, 5,
                2008, 299);
        Car audiQ7_02 = new Q7("WA1LAAF71HD018087", "Diesel", "SUV", "Silver",
                "Automatic", "3.0L", 2.294, 333, 5, 5,
                2016, 329);
        Car audiQ7_03 = new Q7("WA1UFBFL8DA189746", "Diesel", "SUV", "Grey",
                "Automatic", "3.0L", 2.577, 370, 5, 5,
                2015, 319);
        Car audiR8_01 = new R8("WAUEJBFM0B0012187", "Petrol", "Coupe", "Red",
                "Automatic", "5.2L", 1.024, 532, 2, 2,
                2018, 399);
        Car audiR8_02 = new R8("WA1CVCFE3AD002493", "Petrol", "Cabriolet", "Blue",
                "Automatic", "5.2L", 0.989, 610, 2, 2,
                2019, 419);
        Car audiR8_03 = new R8("WAUMJBFM0E0016319", "Petrol", "Cabriolet", "White",
                "Automatic", "5.2L", 1.172, 525, 2, 2,
                2019, 409);
        Car bmwX7_01 = new X7("WBS3R9C50GK337225", "Diesel", "SUV", "Black",
                "Automatic", "3.0L", 1.999, 335, 5, 7,
                2018, 499);
        Car bmwX7_02 = new X7("WBAYB6C55EDS16379", "Diesel", "SUV", "White",
                "Automatic", "4.4L", 0.569, 523, 5, 7,
                2019, 549);
        Car bmwX7_03 = new X7("WBA3B3C59DJ976677", "Petrol", "SUV", "Grey",
                "Automatic", "4.4L", 0.773, 613, 5, 7,
                2020, 599);
        Car bmwM5_01 = new M5("WBAAK8400F8779625", "Petrol", "Sedan", "Grey",
                "Automatic", "4.4L", 1.578, 600, 4, 4,
                2017, 549);
        Car bmwM5_02 = new M5("WBAWL71028PX37287", "Petrol", "Sedan", "Black",
                "Automatic", "4.4L", 1.134, 625, 4, 4,
                2018, 579);
        Car bmwM5_03 = new M5("WBABD53444PC10154", "Petrol", "Sedan", "White",
                "Automatic", "4.4L", 0.999, 625, 4, 4,
                2020, 599);
        Car bmwI3_01 = new I3("WBAAA1300M0012204", "Electricity", "Hatchback", "Grey",
                "Single-speed", "Electric",  0.891, 168, 5,
                4, 2017, 399);
        Car bmwI3_02 = new I3("WB1051600H0180507", "Electricity", "Hatchback", "Blue",
                "Single-speed", "Electric",  0.511, 184, 5,
                4, 2018, 449);
        Car bmwI3_03 =  new I3("WBS1M1C57FVZ99405", "Electricity", "Hatchback", "White",
                "Single-speed", "Electric", 0.436, 184, 5,
                4, 2019, 479);

        List<Car> allCarList = new ArrayList<>();
        allCarList.add(audiA5_01);
        allCarList.add(audiA5_02);
        allCarList.add(audiA5_03);
        allCarList.add(audiQ7_01);
        allCarList.add(audiQ7_02);
        allCarList.add(audiQ7_03);
        allCarList.add(audiR8_01);
        allCarList.add(audiR8_02);
        allCarList.add(audiR8_03);
        allCarList.add(bmwX7_01);
        allCarList.add(bmwX7_02);
        allCarList.add(bmwX7_03);
        allCarList.add(bmwM5_01);
        allCarList.add(bmwM5_02);
        allCarList.add(bmwM5_03);
        allCarList.add(bmwI3_01);
        allCarList.add(bmwI3_02);
        allCarList.add(bmwI3_03);

        return allCarList;
    }
}
