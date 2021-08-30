//3 Sum

package EasyQuestions.Arrays;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<List<Integer>> ans = threeSum(arr);
        System.out.println(Arrays.asList(ans));
    }

    private static ArrayList<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;

            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    j++;
                    continue;
                }
                if (k != arr.length - 1 && arr[k] == arr[k + 1]) {
                    k--;
                    continue;
                }

                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        // for (int i = 0; i < arr.length - 2; i++) {
        //     if (i != 0 && arr[i] == arr[i - 1]) {
        //         continue;
        //     }
        //     int start = i + 1;
        //     int end = arr.length - 1;
        //     while (start < end) {
        //         int sum = arr[i] + arr[start] + arr[end];
        //         if (sum > 0) {
        //             end--;
        //         } else if (sum < 0) {
        //             start++;
        //         } else {
        //             ArrayList<Integer> list = new ArrayList<Integer>();
        //             list.add(arr[i]);
        //             list.add(arr[start]);
        //             list.add(arr[end]);
        //             res.add(list);

        //             start++;
        //             end--;

        //             while (start < end && arr[start] == arr[start + 1]) {
        //                 start++;
        //             }
        //             while (start < end && arr[end] == arr[end - 1]) {
        //                 end--;
        //             }
        //         }
        //     }
        // }
        return res;
    }
}