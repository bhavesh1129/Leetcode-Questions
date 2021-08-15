//Jump Game

package EasyQuestions.Arrays;

import java.util.Scanner;

public class jumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = jumpGame(arr);
        System.out.println(ans);
    }

    private static boolean jumpGame(int[] arr) {
        int maxJump = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxJump < i) {
                return false;
            } else {
                maxJump = Math.max(maxJump, i + arr[i]);
            }
        }
        return true;
    }
}
