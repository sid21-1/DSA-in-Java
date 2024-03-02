package collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(235);
        set.add(3235);
        set.add(4);
        set.add(5);

        System.out.println(set);
        set.remove(4);

        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
