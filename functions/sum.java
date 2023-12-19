import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b;
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();

        int sum = sum(a,b);
        System.out.println(sum);
    }
    static int sum(int a ,int b){
        int sum = a+b;
        return sum;
        
    }    
}
