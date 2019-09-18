package StatePatternOOP;

public class Letter {
    private LetterState state = new OrderState();


    public void setState(LetterState state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
    }
    public void printState(){
        state.printState();
    }
}
