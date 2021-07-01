// Transpose Of A Matrix

package EasyQuestions.Arrays;
import java.util.Scanner;

public class transposeOfAMatrix {
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
        transposeOfAMatrix(row, col, matrix);
    }

    private static void transposeOfAMatrix(int row, int col, int[][] matrix) {
        int[][] transposedMatrix = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.println(transposedMatrix[i][j]);
            }
        }
    }
}
