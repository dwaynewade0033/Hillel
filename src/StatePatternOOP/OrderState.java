package StatePatternOOP;

public class OrderState implements  LetterState {
    @Override
    public void next(Letter letter) {
        letter.setState(new DeliveryState());
    }

    @Override
    public void printState() {
        System.out.println("This is order state");
    }
}
