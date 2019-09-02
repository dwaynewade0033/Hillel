package MyCountry;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private final String name = "Ukraine";
    private List<City> cities = new ArrayList<>(); //композиция

    public List<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }

    public void createCity () {
        City city = new City();
        for (int i = 0; i < 3; i++) {
            city.createStreet();
        }
        city.createBuilders();
        city.setName("City number " + (cities.size() + 1));
        cities.add(city);
    }

}
