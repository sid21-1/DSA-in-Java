import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number ");
        int a = sc.nextInt();
        System.out.print("enter the second number ");
        int b = sc.nextInt();
        System.out.print("enter the third number ");
        int c = sc.nextInt();

        int largest = largest(a, b, c);
        int smallest = smallest(a, b, c);

        System.out.println(" Largest number " + largest);
        System.out.println(" smallest number " + smallest);

    }

    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int smallest(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}