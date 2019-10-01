package StatePatternHomeWork;

public class Card {
    private CardState state = new NormalState();

    public void setState(CardState state) {
        this.state = state;
    }
    public void spend(){
        state.spend(this);
    }

    public void printState(){
        state.printState();
    }

}
