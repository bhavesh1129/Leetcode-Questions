//Kids With the Greatest Number of Candies

package EasyQuestions.Arrays;

import java.util.*;

public class kidsWithGreatestNumOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int extraCandies = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Boolean> res = kidsWithGreatestNumOfCandies(arr, extraCandies);
        System.out.println(Arrays.asList(res));
    }

    private static ArrayList<Boolean> kidsWithGreatestNumOfCandies(int[] arr, int extraCandies) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        ArrayList<Boolean> kidsWithCandies = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + extraCandies;
            if (sum >= max) {
                kidsWithCandies.add(true);
            } else {
                kidsWithCandies.add(false);
            }
        }
        return kidsWithCandies;
    }
}
