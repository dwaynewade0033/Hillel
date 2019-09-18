package StatePatternOOP;

public class DeliveryState implements LetterState{

    @Override
    public void next(Letter letter) {
        letter.setState(new ReceiveState());
    }

    @Override
    public void printState() {
        System.out.println("This state is delivery");
    }
}
