package Generics;

import java.util.ArrayList;
import java.util.List;

public class HelperTest {
    public static <T,V>Pair<T,V> getPair(){
        return  (Pair<T,V>) new Pair<>("d",2);
    }

    public static <T> T getSecongValue(T firstValue, T secondValue){
        return secondValue;
    }
    static <T> void copy(List<? extends T> src, List<? super T> dest){
        dest.addAll(src);
    }
    public static void main(String[] args) {
//        Class c1 = new ArrayList<String>().getClass();
//        Class c2 = new ArrayList<String>().getClass();
//        System.out.println(c1==c2);
        List<Integer> src  = new ArrayList<>();
        src.add(24);
        src.add(30);
        List<Number> dest = new ArrayList<>();
        dest.add(12);
        dest.add(41);
        copy(src,dest);
        System.out.println(dest);

        //  Comparable value = getSecongValue(10L, 2);

    }
    /*public static Integer calc(Integer i1, Integer i2){
        ObjectHelper<Integer> integerHelper1 = new ObjectHelper<Integer>(i1);



        ObjectHelper<String> integerHelper2 = new ObjectHelper<String>("str");
        String value = (String) integerHelper2.getValue();

//        if(integerHelper2.getValue() instanceof String){
//            String value = (String) integerHelper2.getValue();
//        }

        if(!integerHelper1.isPresent()) return 0;
        if(!integerHelper2.isPresent()) return 0;
        //return integerHelper1.getValue() + integerHelper2.getValue();



    }*/
}
