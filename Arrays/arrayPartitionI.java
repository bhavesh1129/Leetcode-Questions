//Array Partition I

package EasyQuestions.Arrays;

import java.util.*;

public class arrayPartitionI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayPartitionI(arr));
    }

    private static int arrayPartitionI(int[] arr) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i += 2) {
            res = res + arr[i];
        }
        return res;
    }
}
