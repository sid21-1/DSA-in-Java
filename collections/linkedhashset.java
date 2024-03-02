package collections;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(235);
        set.add(3235);
        set.add(4);
        set.add(5);

        System.out.println(set);
    }
}
