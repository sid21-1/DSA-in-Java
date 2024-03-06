import java.util.*;

public class Print1ToNbacktrack {

    public static void fn(int i, int n) {
        if (i < 1)
            return;
        fn(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn(n, n);
    }
}