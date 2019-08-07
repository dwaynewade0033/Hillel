package CollectionHomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1999));
        list.add(new Car(2004));
        list.add(new Car(2014));
        list.add(new Car(1994));
        list.add(new Car(1987));
        list.add(new Car(1993));
        list.add(new Car(1995));
        list.add(new Car(1991));
        list.add(new Car(1992));
        list.add(new Car(2005));
        Set<Car> set = new HashSet<>();
        set.add(new Car(2015));
        set.add(new Car(2012));
        set.add(new Car(2018));
        set.add(new Car(2011));
        set.add(new Car(1998));
        set.add(new Car(1999));
        set.add(new Car(1022));
        set.add(new Car(1234));
        set.add(new Car(1992));
        set.add(new Car(2010));
        set.add(new Car(2009));
        set.add(new Car(2008));
        merge(list,set);


    }

    public static List<Car> merge(List<Car> oldList, Set<Car> setOldList) {
        ArrayList<Car> newList = new ArrayList<Car>();
        newList.addAll(oldList);
        Collections.sort(newList, Car.COMPARE_BY_COUNT);
        Car e = newList.get(newList.size() - 1);
        System.out.println(e.getYearOfIssue());
        for(Car car:setOldList){
            if(e.getYearOfIssue()<car.getYearOfIssue()){
                newList.add(car);
            }
        }
        System.out.println(newList);
        return newList;
    }

}
