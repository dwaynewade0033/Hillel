package MyDB;

public class Car {
    private int vinCode;
    private String numberOfCar;
    private String mark;
    private String model;
    private int price;
    private int mileage;
    private int yearOfIssue;

    public Car(int vinCode, String numberOfCar, String mark, String model, int price, int mileage, int yearOfIssue) {
        this.vinCode = vinCode;
        this.numberOfCar = numberOfCar;
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.yearOfIssue = yearOfIssue;
    }

    public int getVinCode() {
        return vinCode;
    }

    public void setVinCode(int vinCode) {
        this.vinCode = vinCode;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinCode='" + vinCode + '\'' +
                ", numberOfCar='" + numberOfCar + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
