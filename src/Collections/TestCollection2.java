package Collections;

import java.util.*;

public class TestCollection2 {
    private static boolean  isTrue(Collection<Integer> list, int test){
        for (Integer value: list){
            if(value == test){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(11);
        list.add(13);
        list.add(12);
        list.add(123);
        System.out.println(isTrue(list, 10));
//        Set<Integer> sets = new HashSet<>();
//        sets.add(1);
//        sets.add(11);
//        sets.add(13);
//        sets.add(12);
//        sets.add(123);
//        System.out.println(isTrue(sets, 40));

    }
}
