package collections;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();
        student.add("Ram");
        student.add("Sid");
        System.out.println(student);

        student.add(1, "Rakesh");
        System.out.println(student);

        LinkedList<String> newList = new LinkedList<>();
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
