package Generics;

import java.util.ArrayList;

public class HelperTest {
    public static <T,V>Pair<T,V> getPair(){
        return  (Pair<T,V>) new Pair<>("d",2);
    }

    public static <T> T getSecongValue(T firstValue, T secondValue){
        return secondValue;
    }
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1==c2);


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
