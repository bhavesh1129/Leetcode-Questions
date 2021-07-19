//Rotate Image

package EasyQuestions.Matrix;
import java.util.*;

public class rotateImage {
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
        rotateImage(arr);
    }

    private static void rotateImage(int[][] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int[] temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
