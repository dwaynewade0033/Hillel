package MyCountry;

public class Builder {
    public void build (City city, Street street, Building building) {
        if (city.getBuilders() == null) {
            System.out.println("The city has no builders");
        }
        else {
            System.out.println("New building built " + building.getType());
            street.getBuildings().add(building);
        }
    }
}
