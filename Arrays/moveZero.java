//Move Zero

package EasyQuestions.Arrays;
import java.util.*;

public class moveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveZero(arr);
    }

    private static void moveZero(int[] arr) {
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[curr++] = arr[i];
            }
        }
        for (int i = curr; i < arr.length; i++) {
            arr[curr] = 0;
        }
    }
}
