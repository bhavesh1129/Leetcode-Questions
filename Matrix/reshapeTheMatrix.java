// Reshape The Matrix

package EasyQuestions.Matrix;

import java.util.*;

public class reshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] result = reshapeTheMatrix(matrix, r, c);
        System.out.println(Arrays.toString(result));
    }

    private static int[][] reshapeTheMatrix(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        int row = 0;
        int col = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col++] = mat[i][j];
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}
