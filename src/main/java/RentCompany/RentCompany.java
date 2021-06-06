package RentCompany;

import Car.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class RentCompany {
    List<Car> cars = new ArrayList<>();
    
    public abstract RentCompany create();
    
    public abstract void addCar(Car car);

    public abstract String generateReport();
}
