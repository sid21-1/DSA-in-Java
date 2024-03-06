import java.util.*;

public class printNtimes {
    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Siddhanth");
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print the String");
        int n = sc.nextInt();
        print(1, n);
    }
}