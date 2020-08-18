package ro.jademy.carrental.data;

import ro.jademy.carrental.models.ExtraFeatures;

import java.util.ArrayList;
import java.util.List;

public class ExtraFeaturesDB {

    public ExtraFeaturesDB() {

    }

    public static List<ExtraFeatures> getAllExtraFeatures() {
        List<ExtraFeatures> allExtraFeatures = new ArrayList<>();
        ExtraFeatures GPS = new ExtraFeatures("GPS", 15);
        ExtraFeatures childSeat = new ExtraFeatures("Child seat", 20);
        ExtraFeatures winterTyres = new ExtraFeatures("Winter tyres", 25);
        ExtraFeatures secondDriver = new ExtraFeatures("Second driver", 30);
        allExtraFeatures.add(GPS);
        allExtraFeatures.add(childSeat);
        allExtraFeatures.add(winterTyres);
        allExtraFeatures.add(secondDriver);

        return allExtraFeatures;
    }
}
