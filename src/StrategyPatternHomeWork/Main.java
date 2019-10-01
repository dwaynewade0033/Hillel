package StrategyPatternHomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(5);
        Counter counter = new Counter();
        counter.setStrategy(new ReversSort());
        counter.quickSort(arrayList);
        System.out.println(counter);
    }
}
