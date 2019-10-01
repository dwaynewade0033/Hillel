package StatePatternHomeWork;

public class BlockState implements CardState {

    @Override
    public void spend(Card card) {
        card.setState(new NormalState());
    }

    @Override
    public void printState() {
        System.out.println("Your card is blocked, sorry");

    }
}
