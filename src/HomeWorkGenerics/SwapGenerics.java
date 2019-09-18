package HomeWorkGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapGenerics {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println(arrayList);
        newValue(arrayList,0,1);

    }

    public static <T> void newValue(List<T> solarSystem, int first, int second){
        Collections.swap(solarSystem, first, second);
        System.out.println(solarSystem);

    }
}
