package Generics;

import java.util.List;

public class ObjectHelper<T extends Number & Comparable<Number>> {
    private final T value;

    public static <V> void setNewValue(V value){

    }

    public ObjectHelper(T value) {
        Integer i =value.intValue() +1;
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public boolean isPresent(){
        return value!=null;
    }


}
