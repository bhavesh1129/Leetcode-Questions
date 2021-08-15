//Find N Unique Integers Sum up to Zero

package EasyQuestions.Arrays;

import java.util.*;

public class findNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = findNUniqueIntegersSumUpToZero(num, arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findNUniqueIntegersSumUpToZero(int num, int[] arr) {
        int newArr[] = new int[num];
        int a = -num / 2;
        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                if (a == 0) {
                    a += 1;
                }
                newArr[i] = a;
                a++;
            } else {
                newArr[i] = a;
                a++;
            }
        }
        return newArr;
    }
}
