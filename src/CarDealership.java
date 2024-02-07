import java.util.ArrayList;

public class CarDealership {
    private String name;
    private ArrayList<Car> cars;

    public CarDealership(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car findCarByBrand(String brandName) {
        for (Car car : cars) {
            if (car.getBrandName().equals(brandName)) {
                return car;
            }
        }
        return null;
    }
}
