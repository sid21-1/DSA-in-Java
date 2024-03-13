import java.util.Scanner;

public class printfibonacci {
    public static void fibo(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("No terms to display.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series:");
            System.out.println("0");
        } else {
            System.out.println("Fibonacci Series:");
            int a = 0, b = 1;
            System.out.println(a);
            System.out.println(b);
            fibo(a, b, n - 2);
        }
    }
}
