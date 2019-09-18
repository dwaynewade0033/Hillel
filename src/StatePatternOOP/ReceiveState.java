package StatePatternOOP;

public class ReceiveState implements LetterState {
    @Override
    public void next(Letter letter) {
        System.out.println("Letter already received");
    }

    @Override
    public void printState() {
        System.out.println("This status is received");
    }
}
