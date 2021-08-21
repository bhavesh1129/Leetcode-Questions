//Median of Two Sorted Arrays

package EasyQuestions.Arrays;

import java.util.*;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        double ans = findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
    }

    private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int newarr[] = new int[len];
        int i, counter = 0;
        double median;
        for (i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
            counter++;
        }
        for (i = 0; i < arr2.length; i++) {
            newarr[counter] = arr2[i];
            counter++;
        }
        Arrays.sort(newarr);
        if (len % 2 == 0) {
            len /= 2;
            median = (newarr[len] + newarr[len - 1]);
            median /= 2;
            return median;
        } else
            median = newarr[(len / 2)];
        return median;
    }
}
