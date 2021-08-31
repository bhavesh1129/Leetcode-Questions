//Relative Sort Array

package EasyQuestions.Arrays;

import java.util.*;

public class relativeSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int resArr[] = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int target = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (target == arr1[j]) {
                    resArr[k++] = target;
                }
            }
        }
        int flag = 0;
        ArrayList<Integer> extraEle = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (target == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                extraEle.add(target);
            }
            flag = 0;
        }
        Collections.sort(extraEle);
        for (int i = 0; i < extraEle.size(); i++) {
            resArr[k++] = extraEle.get(i);
        }
        return resArr;
    }
}
