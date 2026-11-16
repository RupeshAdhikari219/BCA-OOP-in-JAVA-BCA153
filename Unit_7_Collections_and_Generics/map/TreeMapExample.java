package Unit_7_Collections_and_Generics.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args)
    {
        // Creating an empty TreeMap
        Map<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("Rupesh", 10);
        map.put("Student C", 30);
        map.put("Student A", 20);

        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
