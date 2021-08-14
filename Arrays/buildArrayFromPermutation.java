// Build Array from Permutation

package EasyQuestions.Arrays;

import java.util.*;

public class buildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = buildArrayFromPermutation(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] buildArrayFromPermutation(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr[i]];
        }
        return newArr;
    }
}