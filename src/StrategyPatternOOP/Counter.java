package StrategyPatternOOP;

public class Counter {
    private Integer value;
    private Strategy strategy;

    public void execute(int value1, int value2){
        value = strategy.execute(value1, value2);
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Integer getValue() {
        return value;
    }
}
