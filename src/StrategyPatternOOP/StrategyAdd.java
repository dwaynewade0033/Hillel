package StrategyPatternOOP;

public class StrategyAdd implements Strategy{

    @Override
    public Integer execute(int value1, int value2) {
        return value1+value2;
    }
}
