package collections;

import java.util.*;

public class collectionsclass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(43);
        list.add(34);

        System.out.println("the max number in the arraylist is " + Collections.max(list));
        System.out.println("the min number in the arraylist is " + Collections.min(list));
        System.out.println("frequency " + Collections.frequency(list, 1));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
