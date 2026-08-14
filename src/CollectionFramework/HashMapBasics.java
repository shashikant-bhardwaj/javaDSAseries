package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    static void main() {

        Map<String,String> map = new HashMap<>();

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


    }
}
