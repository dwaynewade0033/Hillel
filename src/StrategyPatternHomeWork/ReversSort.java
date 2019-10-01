package StrategyPatternHomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class ReversSort implements Strategy {
    @Override
    public ArrayList<Integer> quickSort(ArrayList<Integer> collectionSimple) {
        Collections.sort(collectionSimple);
        Collections.reverse(collectionSimple);
        return collectionSimple;
    }
}
