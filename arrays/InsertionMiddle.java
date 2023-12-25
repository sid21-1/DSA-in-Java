package arrays;

public class InsertionMiddle {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int newValue = 5;
        int insertIndex = 2;
        for (int i = numbers.length; i < insertIndex; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[insertIndex] = newValue;
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
