//Squares of a Sorted Array

package EasyQuestions.Arrays;

import java.util.*;

public class squaresOfASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = squaresOfASortedArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] squaresOfASortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        Arrays.sort(arr);
        return arr;
    }
}
