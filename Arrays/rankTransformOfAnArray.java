//Rank Transform of an Array

package EasyQuestions.Arrays;

import java.util.*;

public class rankTransformOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = rankTransformOfAnArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rankTransformOfAnArray(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        Collections.sort(newArr);
        for (int i = 0; i < arr.length; i++) {
            int getIndex = newArr.indexOf(arr[i]);
            arr[i] = getIndex + 1;
        }
        return arr;
    }
}
