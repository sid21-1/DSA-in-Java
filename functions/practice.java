// import java.util.Arrays;
// import java.util.Scanner;

// class practice {
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // System.out.println(Arrays.toString(arr));
//         // for (int i : arr) {
//         // System.out.println(i);
//         // }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

import java.util.ArrayList;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(54);
        list.add(23);
        list.add(12312);
        list.add(22342133);
        list.add(55354);
        list.add(233);
        list.add(53524);
        list.add(2352353);
        list.add(52354);
        list.add(22353);
        list.add(5544);
        list.add(263);
        list.add(5464);
        list.add(24363);
        System.out.println(list.contains(2141341341));
        System.out.println(list);
    }
}