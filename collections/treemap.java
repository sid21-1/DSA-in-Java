package collections;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        numbers.putIfAbsent("Five", 100);
        System.out.println(numbers);
    }
}
