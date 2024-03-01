package collections;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Ram");
        student.add("Sid");
        System.out.println(student);

        student.add(1, "Rakesh");
        System.out.println(student);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Vedanth");
        newList.add("Kishan");

        student.addAll(newList);
        System.out.println(student);

        System.out.println(student.get(1));

        student.remove(String.valueOf("Vedanth"));
        System.out.println(student);

        student.set(2, "Harry");
        System.out.println(student);

        student.clear();
        System.out.println(student);
    }
}
