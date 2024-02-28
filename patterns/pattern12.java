import java.util.Scanner;

public class pattern12 {
    public static void printPattern(int N) {
        for (int i = N; i >= 1; i--) {
            int num = N;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(num + " ");
                }
                num--;
            }
            System.out.print("$"); // Print "$" instead of a new line
        }
        System.out.println(); // End the line after printing the pattern
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        printPattern(N);
        scanner.close();
    }
}
