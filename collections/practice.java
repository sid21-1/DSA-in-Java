package collections;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        // This is the way in java to created a min value and a max value of a variable
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        ArrayList<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        HashSet<Integer> c = new HashSet<>();

        // This one is for ArrayList
        for (int i = 0; i < 5; i++) {
        a.add(i * 2);
        }
        System.out.println("the elements in the arraylist are");
        for (int nums : a) {
        System.out.print(nums + " ");
        }
        System.out.println();

        // This one is for List
        for (int i = 0; i < 5; i++) {
        b.add(i * 3);
        }
        System.out.println("the elements in the list are");
        for (int nums : b) {
        System.out.print(nums + " ");
        }
        System.out.println();

        // This one is for hashset
        // no duplicate elements are stored in hashset
        // contains and isEmpty
        System.out.println("the elements are in HashSet");
        for (int i = 0; i < 5; i++) {
        c.add(i * 4);
        }
        for (int nums : c) {
        System.out.print(nums + " ");
        }

        Map<String, Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("enter the fruit name");
            String fruit = sc.nextLine();

            System.out.println("enter the quantity of the fruit");
            int quantity = Integer.parseInt(sc.nextLine());

            hashMap.put(fruit, quantity);
        }

        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
