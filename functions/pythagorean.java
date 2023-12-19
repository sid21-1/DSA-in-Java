import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b = sc.nextInt();
        System.out.println("enter the third number");
        c = sc.nextInt();

        py(a, b, c);
    }

    static void py(int a , int b, int c){
        int lhs = a*a + b*b;
        int rhs = c*c;
        if(lhs == rhs){
            System.out.print("it is a pythagorean");
        }
        else 
        {
            System.out.println("It is not a pythagorean");
        }
    }
}
