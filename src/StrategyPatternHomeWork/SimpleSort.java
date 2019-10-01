package StrategyPatternHomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort implements Strategy {
    @Override
    public ArrayList<Integer> quickSort(ArrayList<Integer> collectionSimple) {
        Collections.sort(collectionSimple);
        return collectionSimple;
    }
}
