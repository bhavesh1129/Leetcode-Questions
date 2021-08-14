//How Many Numbers Are Smaller Than the Current Number

package EasyQuestions.Arrays;

import java.util.*;

public class smallerThanTheCurrentNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = smallerThanTheCurrentNum(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] smallerThanTheCurrentNum(int[] arr) {
        int[] countArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            countArr[i] = count;
            count = 0;
        }
        return countArr;
    }
}
