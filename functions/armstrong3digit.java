import java.util.Scanner;

public class armstrong3digit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // boolean ans = armstrong(n);
        // System.out.println(ans);

        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }
}