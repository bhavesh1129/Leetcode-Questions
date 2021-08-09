//Flipping an Image

package EasyQuestions.Matrix;

import java.util.*;

public class flippingAnImage {
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
        flippingAnImage(row, col, matrix);
    }

    private static void flippingAnImage(int row, int col, int[][] matrix) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = matrix[i][col - j - 1];

                if (res[i][j] == 1) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
