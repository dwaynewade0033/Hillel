package StrategyPatternOOP;

public class TestStrategy {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setStrategy(new StrategyAdd());
        counter.execute(1,2);
        System.out.println(counter.getValue());
        counter.setStrategy(new StrategyMinus());
        counter.execute(2,1);
        System.out.println(counter.getValue());
    }

}
