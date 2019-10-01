package StatePatternHomeWork;

public class NormalState implements CardState {

    @Override
    public void spend(Card card) {
        card.setState(new CreditState());
    }

    @Override
    public void printState() {
        System.out.println("you have normal state of your card");

    }
}
