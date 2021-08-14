//Concatenation Of Array

package EasyQuestions.Arrays;
import java.util.*;

public class concatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = concatenationOfArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] concatenationOfArray(int[] arr) {
        int[] newArr = new int[2 * arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length] = arr[i];
        }
        return newArr;
    }
}
