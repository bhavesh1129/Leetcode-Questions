//Count of Smaller Numbers After Self

package EasyQuestions.Arrays;

import java.util.*;

public class countOfSmallerNumAfterSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> aL = countOfSmallerNumAfterSelf(arr);
        System.out.println(Arrays.asList(aL));
    }

    private static ArrayList<Integer> countOfSmallerNumAfterSelf(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            newArr.add(count);
            count = 0;
        }
        return newArr;
    }
}
