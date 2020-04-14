package SingletonePatternOOP;

public class DataBase {

    private DataBase() {
    }

    private static class Helper {
        private static final DataBase instance = new DataBase();
    }

    public static DataBase getInstance() {
        return Helper.instance;
    }


}
