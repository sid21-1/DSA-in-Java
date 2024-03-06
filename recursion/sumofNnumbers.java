import java.util.*;

public class sumofNnumbers {

    public static long sum = 0;

    public static long sumFirst(long n) {
        if (n < 1)
            return 0;
        sum = sum + n;
        sumFirst(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = sumFirst(n);
        System.out.println(result);
    }
}
