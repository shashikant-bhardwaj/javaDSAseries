package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    static void main() {

        Map<String,String> map = new HashMap<>(); // time complexity --> O(1)

        //insertion

        map.put("in", "India");
        map.put("en", "England");
        map.put("us", "United States");
        map.put("fr", "France");
        System.out.println(map);

        Map<String,String> map2 = new HashMap<>();
        map2.put("br", "brazil");
        System.out.println("Before: " + map2);
        map2.putAll(map);
        System.out.println("After: " +map2);

        //deletion

        map2.remove("en");
        System.out.println("After: " + map2);

        //size
        System.out.println(map2.size());
//        map2.clear();
//        System.out.println(map2.size());

         map2.putIfAbsent("is", "India");
         System.out.println(map2);

        System.out.println(map2.get("us"));

        System.out.println(map2.getOrDefault("in", "None"));

        System.out.println(map2.containsKey("in"));
        System.out.println(map2.containsValue("India"));

        map2.replace("in","Indonesia");
        System.out.println(map2);

//        map2.remove("in","india");
        System.out.println(map2);



        Set<String> keyset = map2.keySet();
        System.out.println("keyset: " + keyset);

        Collection<String> valuesset = map2.values();
        System.out.println("valueset: " + valuesset);


        //get all the entries from map

       Set<Map.Entry<String, String>> entries = map2.entrySet();
        System.out.println("entries: " + entries);


        //how to do loop map

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1,"One");
        map3.put(2,"Two");
        map3.put(3,"Three");

        for(Map.Entry<Integer, String> entry : map3.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

            //LinkedHashMap --> time complexity--> O(n)
            //TreeMap




        }


    }
}
