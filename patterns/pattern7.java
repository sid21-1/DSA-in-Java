import java.util.Scanner;

public class pattern7 {

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        pattern(n);
    }
}
