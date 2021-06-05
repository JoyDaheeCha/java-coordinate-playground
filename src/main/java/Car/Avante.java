package Car;

public class Avante extends Car {
    private static String name = "Avante";
    private static final int distancePerLiter = 15;

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
