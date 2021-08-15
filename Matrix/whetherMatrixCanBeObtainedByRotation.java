//Determine Whether Matrix Can Be Obtained By Rotation

package EasyQuestions.Matrix;

import java.util.*;

public class whetherMatrixCanBeObtainedByRotation {
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
        int[][] target = new int[row][col];
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                target[i][j] = sc.nextInt();
            }
        }
        boolean ans = checkWhetherMatrixCanBeObtainedByRotation(mat, target);
        System.out.println(ans);
    }

    private static boolean checkWhetherMatrixCanBeObtainedByRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            mat = rotateMatrix(mat);
        }
        return false;
    }

    public static int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] rotatedMat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMat[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotatedMat;
    }
}
