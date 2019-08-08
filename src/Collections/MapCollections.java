package Collections;

import java.util.*;

public class MapCollections {

    private static Map<String,Integer> compute(final String text){
        if(text == null || text.length() ==0){
            return Collections.emptyMap();
        }
        Map<String, Integer> out = new HashMap<>();
        for(String item: text.replaceAll(",|\\.", "").trim().split(" ")){

            out.compute(item, (k, v)-> v == null?1:++v);
        }
        return out;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>(10,0.75f,true);
        map.put(1,4);
        map.put(4,8);
        map.put(2,1);
        map.put(6,2);
        Integer value = map.get(9090);
        if(Objects.nonNull(value)){

        }
//        map.getOrDefault(900, Integer.valueOf(0)).toString();
//        for (Map.Entry<Integer,Integer> item :map.entrySet()){
//            System.out.println(item.getKey() + item.getValue());
//        }
        map.forEach((k, v)-> System.out.println(k+v));


        map.compute(6, (key, v)->++v);
        map.computeIfAbsent(6, (q)->++q);
        System.out.println(map);

    }

}
