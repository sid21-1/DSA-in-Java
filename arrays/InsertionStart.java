package arrays;

public class InsertionStart {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int newNumber = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newNumber;
        for (int newarr : arr) {
            System.out.print(newarr + " ");
        }
    }

}
