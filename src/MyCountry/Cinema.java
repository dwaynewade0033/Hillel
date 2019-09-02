package MyCountry;

public class Cinema implements Building {
    String type;
    public Cinema() {
        this.type = "кино";
    }

    @Override
    public String getType () {
        return type;
    }
}
