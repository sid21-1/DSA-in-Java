import java.util.Scanner;

public class fibonacci {

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        int last = fibo(n - 1);
        int secondLast = fibo(n - 2);
        return last + secondLast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
