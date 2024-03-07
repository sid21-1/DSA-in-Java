import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of integers with the given size
        int[] array = new int[size];

        // Input elements of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(array, 0, size - 1);

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive function to reverse the array
    public static void reverseArray(int[] arr, int start, int end) {
        // Base condition: If start index crosses end index, return
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated indices
        reverseArray(arr, start + 1, end - 1);
    }
}
