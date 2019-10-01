package HomeWorkGenerics;
import java.util.*;
public class SwapGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(444);
        arrayList.add(55);
        arrayList.add(66);
        arrayList.add(777);
        arrayList.add(88);
        arrayList.add(99);
        System.out.println(arrayList);
        maxValue(arrayList,3,7);

    }

    public static <T> void newValue(List<T> value, int first, int second){
        Collections.swap(value, first, second);
        System.out.println(value);

    }

    public static <T> void maxValue(List<T> value, int first, int second){
        List<T> sublist = value.subList(second, value.size());
        value.removeAll(sublist);
               for (int i = 0; i<first;i++){
            value.remove(0);
               }
            Set<T> set = new TreeSet<>();
            set.addAll(value);
        System.out.println(getLastElement(set));
    }
    public static Object getLastElement(final Collection c) {
        final Iterator itr = c.iterator();
        Object lastElement = itr.next();
        while(itr.hasNext()) {
            lastElement = itr.next();
        }
        return lastElement;
    }
}
