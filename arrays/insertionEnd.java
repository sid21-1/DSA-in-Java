package arrays;

public class insertionEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int newValue = 6;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];

        }
        newArr[newArr.length - 1] = newValue;
        arr = newArr;

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
