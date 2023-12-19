import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();
        boolean vote = voting(age);
        System.out.println(vote);
    }

    static boolean voting(int age) {
        if(age<18){
            return false ;
        }
        else{
            return true;
        }
    }
}
