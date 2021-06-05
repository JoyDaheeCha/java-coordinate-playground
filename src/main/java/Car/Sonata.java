package Car;

public class Sonata extends Car {
    private static String name = "Sonata";
    private static final int distancePerLiter = 10;

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return name;
    }
}
