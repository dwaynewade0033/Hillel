package Collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(100);
        array.add(9);
        array.add(13);
        array.add(13);
        array.add(13);
        array.add(13);
        array.add(15);
        for (Integer arrays : new ArrayList<>(array)) {
            if (arrays == 13) {
                array.remove(arrays);

            }
        }
       // System.out.println(array);
        Map<Integer, String> map =  new HashMap<>();
//        System.out.println(map.put(1, "The first"));
//        System.out.println(map.put(1, "The first"));
//        System.out.println(map.get(1));


        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(32);
        System.out.println(hashSet);

    }

}



