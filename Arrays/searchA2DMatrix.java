//Search a 2D Matrix

package EasyQuestions.Arrays;
import java.util.*;

public class searchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(searchA2DMatrix(arr, target));
    }

    private static boolean searchA2DMatrix(int[][] arr, int target) {
        int[] temp = new int[arr.length * arr[0].length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[k++] = arr[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (target == temp[i]) {
                return true;
            }
        }
        return false;
    }
}
