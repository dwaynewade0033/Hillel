package CollectionHomeWork;

import java.util.Comparator;

public class Car {
    private int yearOfIssue;

    public Car(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
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
                "yearOfIssue=" + yearOfIssue +
                '}';
    }
    public static final Comparator<Car> COMPARE_BY_COUNT = new Comparator<Car>() {
        @Override
        public int compare(Car lhs, Car rhs) {
            return lhs.getYearOfIssue() - rhs.getYearOfIssue();
        }
    };
}
