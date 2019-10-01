package MyDB;


import java.util.*;


public class Service implements CarService {
    private final Map<Integer, Car> cars = new HashMap<>();


    @Override
    public Car findByVIN(String vin, List<Car> cars) {
        return null;
    }
    @Override
    public Car findByNumber(String number, List<Car> cars) {
        return cars.stream().filter(c -> c.getNumberOfCar().equals(number)).findFirst().orElse(null);
    }

    @Override
    public List<Car> findByMarkAndModel(List<Car> cars) {
        return null;
    }

    @Override
    public List<Car> findByYearOfIssue(List<Car> cars) {
        return null;
    }

    @Override
    public List<Car> findByMileage(List<Car> cars) {
        return null;
    }

    @Override
    public List<Car> findByPrice(List<Car> cars) {
        return null;
    }


    @Override
    public Car create(Car car) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Car> read(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Car> get() {
        System.out.println("Retrieving all cars");
        return cars.values();
    }
}
