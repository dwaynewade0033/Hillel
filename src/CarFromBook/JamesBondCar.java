package CarFromBook;

public class JamesBondCar extends Car {
    @Override
    public int drive(int howLong) {
        int distance = howLong*180;
        System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {
        JamesBondCar jamesBondCar = new JamesBondCar();
        jamesBondCar.drive(2);
    }
}
