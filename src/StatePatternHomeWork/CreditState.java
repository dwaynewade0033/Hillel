package StatePatternHomeWork;

public class CreditState implements CardState {


    @Override
    public void spend(Card card) {
        card.setState(new BlockState());
    }

    @Override
    public void printState() {
        System.out.println("You spent a lot of money and now you use credit money");

    }
}
