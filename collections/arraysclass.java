package collections;

import java.util.Arrays;

public class arraysclass {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 is " + index);

        int[] num = { 1, 543, 32423, 65474, 2, 153, 657, 67, 666 };
        Arrays.sort(num);

        Arrays.fill(num, 12);
        for (int i : num) {
            System.out.print(i + " ");
        }

    }
}
