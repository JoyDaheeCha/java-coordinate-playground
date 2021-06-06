package Car;

public class Sonata extends Car {
    private static String name = "Sonata";
    private static final int distancePerLiter = 10;

    public Sonata(int tripDistance) {
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
