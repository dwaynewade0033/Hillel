package MyDB;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CarService {
    Car create(final Car user);

    Car update(final Car user);

    void delete(final int id);

    Optional<Car> read(final int id);

    Collection<Car> get();

    public Car findByVIN(String vin, List<Car> cars);

    public Car findByNumber(String number, List<Car> cars);
    public List<Car> findByMarkAndModel(List<Car> cars);
    public List<Car> findByYearOfIssue(List<Car> cars);
    public List<Car> findByMileage(List<Car> cars);
    public List<Car> findByPrice(List<Car> cars);

    }


