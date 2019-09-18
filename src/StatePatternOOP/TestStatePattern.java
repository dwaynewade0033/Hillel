package StatePatternOOP;

public class TestStatePattern {
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.setState(new OrderState());
        letter.next();
        letter.printState();
        letter.next();
        letter.printState();
    }
}
