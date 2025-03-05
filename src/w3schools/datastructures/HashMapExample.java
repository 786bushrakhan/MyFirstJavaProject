package w3schools.datastructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main (String [] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("India", "Delhi");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Germany"));
        System.out.println(capitalCities.size());
        capitalCities.put("India", "Bhopal");
        System.out.println(capitalCities);
        capitalCities.remove("Norway");
        System.out.println(capitalCities.size());
        System.out.println(capitalCities);
        //capitalCities.clear();
        System.out.println(capitalCities.size());
        System.out.println(capitalCities);
        Set<String> keys = capitalCities.keySet();
        System.out.println(keys);
        for(String key : capitalCities.keySet()){
            System.out.println(key);
        }
        Collection<String> values = capitalCities.values();
        System.out.println(values);

        for (String value : values){
            System.out.println(value);

        }

        for (String key : capitalCities.keySet()){
            System.out.println("key " + key + " value " + capitalCities.get(key));

        }

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Bushra", 28);
        people.put("Danish", 26);
        people.put("Afreen", 30);
        people.put("Heena", 32);
        System.out.println(people.containsKey("Bushra"));
        System.out.println(people.containsKey("abcd"));
        System.out.println(people.containsValue(32));
        System.out.println(people.containsValue(90));

        for (String key: people.keySet()) {
            System.out.println("key " + key + " value " + people.get(key));
        }

        for (Integer value : people.values()) {
            System.out.println(value);
        }


    }
}

