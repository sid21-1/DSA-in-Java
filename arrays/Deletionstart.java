package arrays;

import java.util.Arrays;

public class Deletionstart {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        for(int i=0; i<numbers.length-1; i++){
            numbers[i]= numbers[i+1];
        }
        numbers= Arrays.copyOf(numbers,numbers.length-1);

        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
}
