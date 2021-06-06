package RentCompany;

import Car.Car;

public class MyRentCompany extends RentCompany{

    @Override
    public RentCompany create() {
        return this;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String generateReport() {
        String NEWLINE = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName())
                    .append(" : ").append((int)car.getChargeQuantity()).append("리터")
                    .append(NEWLINE);
        }
        return sb.toString();
    }
}
