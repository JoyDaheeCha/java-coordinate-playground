package Car;

public class K5 extends Car {
    private static String name = "K5";
    private static final int distancePerLiter = 13;

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
