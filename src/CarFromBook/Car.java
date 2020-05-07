package CarFromBook;

public class Car {
    public void start(){
        System.out.println("Engine start");
    }

    public void stop(){
        System.out.println("Engine stop");
    }
    public int drive(int howLong){
        int distance =  howLong*60;
        System.out.println("Car drove " + distance);
        return distance;
    }
}
