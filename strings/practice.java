package strings;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);
        // String firstName = "Siddhanth";
        // String lastName = "Gupta";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // String name = "Siddhanth";
        // String name2 = "Siddhanth";
        // if(name.compareTo(name2)==0){
        // System.out.println("Both the strings are equal");
        // }
        // else{
        // System.out.println("Both the strings are not equal");
        // }

        String name = "Siddhanth Gupta";
        String sub = name.substring(0, 9);
        System.out.println(sub);
    }

}
