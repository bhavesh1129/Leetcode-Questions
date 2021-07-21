//Three Consecutive Odds

package EasyQuestions.Arrays;
import java.util.Scanner;

public class threeConsecutiveOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(threeConsecutiveOdds(arr));
    }

    private static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0, count = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count = 0;
            else if (++count == 3)
                return true;
        }
        return false;
    }
}
