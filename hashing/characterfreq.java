import java.util.Scanner;

public class characterfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            char c = sc.next().charAt(0);

            // Fetch and print frequency
            System.out.println(hash[c - 'a']);
        }
    }
}
