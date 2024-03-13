import java.util.Scanner;

public class powxn {

    public static int cal(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        int xPown = cal(x, n - 1);
        int pow = x * xPown;
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power of the number");
        int n = sc.nextInt();
        System.out.println("Enter the value of the variable");
        int x = sc.nextInt();
        int result = cal(x, n);
        System.out.println("The result is " + result);
    }

}
