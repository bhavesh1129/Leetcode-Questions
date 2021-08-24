//Sort Array By Parity

package EasyQuestions.Arrays;

import java.util.*;

public class sortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = sortArrayByParity(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sortArrayByParity(int[] arr) {
        if (arr.length == 1)
            return arr;

        int[] newArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[k++] = arr[i];
            } else {
                newArr[arr.length + k - i - 1] = arr[i];
            }
        }
        return newArr;
    }
}
