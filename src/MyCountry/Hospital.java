package MyCountry;

public class Hospital implements Building {
    String type;
    public Hospital() {
        this.type = "больница";
    }

    @Override
    public String getType () {
        return type;
    }
}
