package collections;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        numbers.putIfAbsent("Five", 100);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : numbers.keySet()) {
            System.out.println(key);

        }

        for (Integer value : numbers.values()) {
            System.out.println(value);

        }

        System.out.println(numbers.containsKey("One"));
        System.out.println(numbers.containsValue(1));
        System.out.println(numbers.isEmpty());
    }
}
