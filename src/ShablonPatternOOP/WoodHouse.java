package ShablonPatternOOP;

public class WoodHouse extends HouseTemplate {
    @Override
    protected void buildFoundation() {
        System.out.println("building wood foundation");
    }

    @Override
    protected void buildWindow() {
        System.out.println("building wood window");
    }

    @Override
    protected void buildwals() {
        System.out.println("building wood walls");
    }
}
