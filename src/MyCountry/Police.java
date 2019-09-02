package MyCountry;

public class Police implements Building {
    String type;
    public Police() {
        this.type = "полиция";
    }

    @Override
    public String getType () {
        return type;
    }
}
