import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
        static String armstrongNumber(int n){
            int d=0, sum=0, copy = n;
            while(n>0){
                d=n%10;
                sum = sum +d*d*d;
                n=n/10;
            }
            return copy == sum ?"Yes":"No";
        }
    
}
