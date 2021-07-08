//Majority Element

package EasyQuestions.Arrays;

import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        // APPROACH 1-------------->
        // int count = 1;
        // int temp = 0;
        // if (arr.length <= 2)
        // return arr[0];

        // Arrays.sort(arr);
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] == arr[i - 1]) {
        // count++;
        // if (count >= arr.length / 2) {
        // temp = arr[i];
        // }
        // } else {
        // count = 0;
        // }
        // }
        // return temp;

        // APPROACH 2-------------->
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}