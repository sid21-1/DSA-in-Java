import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            int number = sc.nextInt();

            // Fetch and print frequency
            System.out.println(mpp.getOrDefault(number, 0));
        }
    }
}
