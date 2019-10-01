package StatePatternHomeWork;

public class TestCard {
    public static void main(String[] args) {
        Card card =new Card();
        card.printState();
        card.spend();
        card.printState();
        card.spend();
        card.printState();

    }
}
