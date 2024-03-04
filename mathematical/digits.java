import java.util.Scanner;

public class digits {
    static void extractDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println("The sum of the digits " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        extractDigits(n);
    }
}
