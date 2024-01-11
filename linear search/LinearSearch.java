public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 3, 19, -3, 16, -11, 28 };
        int target=1;
        int result = linearSearch(nums, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // Element not found
        return Integer.MAX_VALUE;
    }

    // searching and returning the index
    // static int linearSearch(int[] arr, int target) {
    // if (arr.length == 0) {
    // return -1;
    // }

    // for (int index = 0; index < arr.length; index++) {
    // int element = arr[index];
    // if (element == target) {
    // return index;
    // }
    // }

    // // Element not found
    // return -1;
    // }
}
