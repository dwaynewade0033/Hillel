package HomeWorkGenerics;
import javax.management.ObjectName;
import java.util.*;

public class SwapGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        System.out.println(arrayList);
        maxValue(arrayList,0,1);

    }

    public static <T> void newValue(List<T> value, int first, int second){
        Collections.swap(value, first, second);
        System.out.println(value);

    }

    public static <T extends Number> void maxValue(List<T> value, int first, int second){
        Set<T> set = new TreeSet<>();
        set.addAll(value);
        System.out.println(set);
        List<T> nameList = new ArrayList<>(set);
        System.out.println(nameList);
        System.out.println(nameList.get(second));


    }
}
