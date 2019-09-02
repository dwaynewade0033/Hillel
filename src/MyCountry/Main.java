package MyCountry;

public class Main {
    public static void main(String[] args) {
        Country country = initCountry();
        createBuilding(country, 1, 2, 1);
        createBuilding(country, 1, 2, 5);
        createBuilding(country, 2, 1, 2);
        createBuilding(country, 2, 2, 6);
        MyCountry(country);
    }

    public static Country initCountry() {
        Country country = new Country();
        for (int i = 0; i < 5; i++) {
            country.createCity();
        }
        return country;
    }

    public static void MyCountry(Country country) {
        for (int i = 0; i < country.getCities().size(); i++) {
            City city = country.getCities().get(i);
            System.out.println((i + 1) + ". " + city.getName());
            for (int j = 0; j < city.getStreets().size(); j++) {
                Street street = city.getStreets().get(j);
                System.out.println((i + 1) + "." + (j + 1) + ". " + street.getName());
                if (street.getBuildings().size() == 0) {
                    System.out.println("No buildings were found on this street");
                } else {
                    System.out.print("Buildings found: ");
                    for (int k = 0; k < street.getBuildings().size(); k++) {
                        Building building = street.getBuildings().get(k);
                        System.out.print((k + 1) + ". " + building.getType() + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void createBuilding(Country country, int cityNumber, int numberOfStreet, int numberOfBuilding) {
        City city = country.getCities().get(cityNumber - 1);
        Street street = city.getStreets().get(numberOfStreet - 1);
        Builder builders = country.getCities().get(cityNumber - 1).getBuilders();
        Building building = null; // полиморфизм
        selectNumberOfBuilding:
        while (building == null) {
            switch (numberOfBuilding) {
                case 1: {
                    building = new House();
                    break;
                }
                case 2: {
                    building = new School();
                    break;
                }
                case 3: {
                    building = new Police();
                    break;
                }
                case 4: {
                    building = new Shop();
                    break;
                }
                case 5: {
                    building = new Hospital();
                    break;
                }
                case 6: {
                    building = new Cinema();
                    break;
                }
            }
        }
        builders.build(city, street, building);
    }

}
