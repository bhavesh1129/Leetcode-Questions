package EasyQuestions.Matrix;

import java.util.Scanner;

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
        reshapeTheMatrix(matrix, r, c);
    }

    private static int[][] reshapeTheMatrix(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        int p = 0;
        int q = 0;
        int[][] cat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (q >= n && p < m - 1) {
                    q = 0;
                    p++;
                }
                cat[i][j] = mat[p][q++];
            }
        }
        return cat;
    }
}
