package Car;

public class K5 extends Car {
    private static String name = "K5";
    private static final int distancePerLiter = 13;

    public K5(int tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public String getName() {
        return name;
    }
}
