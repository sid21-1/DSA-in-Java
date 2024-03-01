package collections;

import java.util.ArrayList;

public class iteratorInArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("the element from for each loop " + element);
        }

        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        // System.out.println("iterator" + it.next());
        // }

    }
}
