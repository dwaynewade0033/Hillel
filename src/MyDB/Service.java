package MyDB;


import java.util.List;


public class Service {
    public Car findByVIN(String vin, List<Car> cars) {
        return cars.stream().filter(c -> c.getVinCode().equals(vin)).findFirst().orElse(null);
    }

    public Car findByNumber(String number, List<Car> cars) {
        return cars.stream().filter(c -> c.getNumberOfCar().equals(number)).findFirst().orElse(null);

//    }
//    public List<Car> findByMarkAndModel(List<Car> cars){
//
//    }
//    public List<Car> findByYearOfIssue(List<Car> cars){
//
//    }
//    public List<Car> findByMileage(List<Car> cars){
//
//    }
//    public List<Car> findByPrice(List<Car> cars){
//
//    }
//    public List<Car> allCars(List<Car> cars){
//
//    return cars;
//    }
    }
}
