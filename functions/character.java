import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
        int result = checkAlphabetCase(a);

        System.out.println("Output: " + result);
    }

    static int checkAlphabetCase(char a) {
        if (a >= 'A' && a <= 'Z') {
            return 1;
        } else if (a >= 'a' && a <= 'z') {
            return 0;
        } else {
            return -1;
        }
    }
}
