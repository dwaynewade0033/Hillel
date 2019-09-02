package MyCountry;

public interface Building {
    default String getType () {
        return "Здание";
    }
}
