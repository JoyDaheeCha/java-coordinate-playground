package Car;

public class Avante extends Car {
    private static String name = "Avante";
    private static final int distancePerLiter = 15;

    public Avante(int tripDistance) {
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
