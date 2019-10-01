package HomeWorkGenerics2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> finalList = new ArrayList<>();
        List<Integer> finalwList = new ArrayList<>();
        finalList.add(3);
        finalList.add(4);
        finalList.add(5);
        finalList.add(6);
        finalwList.add(3);
        finalwList.add(4);
        finalwList.add(5);
        finalwList.add(6);
        finalwList.add(123);
        finalCol(finalList, finalwList);

    }

    public static <T> void finalCol(List<T> first, List<T> second) {
        Set<T> finalSet = new TreeSet<>();
        finalSet.addAll(first);
        finalSet.addAll(second);
        System.out.println(finalSet);
    }

    public static <T> void columns(List<T> first, List<T> second) {
        List<T> finalList = new ArrayList<T>();
        finalList = first;
        finalList.retainAll(second);
        System.out.println(finalList);

    }
}
