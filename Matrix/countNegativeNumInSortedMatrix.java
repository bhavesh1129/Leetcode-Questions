//Count Negative Numbers in a Sorted Matrix

package EasyQuestions.Matrix;

import java.util.*;

public class countNegativeNumInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(countNegativeNumInSortedMatrix(mat));
    }

    private static int countNegativeNumInSortedMatrix(int[][] mat) {
        int start, end, ans = 0;
        for (int i = 0; i < mat.length; i++) {
            start = 0;
            end = mat[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mat[i][mid] >= 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            ans += mat[i].length - start;
        }
        return ans;
    }
}
