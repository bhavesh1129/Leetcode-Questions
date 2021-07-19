//Spiral Matrix

package EasyQuestions.Matrix;
import java.util.*;

public class spiralMatrix {
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
        List<Integer> res = spiralMatrix(row, col, arr);
        int size = res.size();
        for (int i = 0; i < size; ++i)
            System.out.print(res.get(i) + " ");
        System.out.println();
    }

    private static List<Integer> spiralMatrix(int row, int col, int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        int k = 0;

        // i-->row, j-->col

        if (arr.length == 0 || arr[0].length == 0)
            return res;

        while (true) {
            // top
            for (int i = top, j = left; j <= right; j++) {
                res.add(arr[i][j]);
            }
            top++;
            if (left > right || top > bottom)
                break;

            // right
            for (int i = top, j = right; i <= bottom; i++) {
                res.add(arr[i][j]);
            }
            right--;
            if (top > bottom || left > right)
                break;

            // bottom
            for (int i = bottom, j = right; j >= left; j--) {
                res.add(arr[i][j]);
            }
            bottom--;
            if (top > bottom || left > right)
                break;

            // left
            for (int i = bottom, j = left; i >= top; i--) {
                res.add(arr[i][j]);
            }
            left++;
            if (top > bottom || left > right)
                break;
            k++;
        }
        return res;
    }
}
