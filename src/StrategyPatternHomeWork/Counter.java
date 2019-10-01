package StrategyPatternHomeWork;

import java.util.ArrayList;


public class Counter {
    private ArrayList<Integer> value;
    private Strategy strategy;

        public  void quickSort(ArrayList<Integer> collectionSimple){
      value =  strategy.quickSort(collectionSimple);
    }


    public ArrayList<Integer> getValue() {
        return value;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
