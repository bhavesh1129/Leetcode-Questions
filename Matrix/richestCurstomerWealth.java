//Richest Customer Wealth

package EasyQuestions.Matrix;

import java.util.Scanner;

public class richestCurstomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        richestCurstomerWealth(matrix);
    }

    private static void richestCurstomerWealth(int[][] matrix) {
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            int max = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                max += matrix[i][j];
            }
            res = Math.max(max, res);
        }
        System.out.println(res);
    }
}
