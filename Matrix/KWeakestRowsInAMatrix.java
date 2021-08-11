// The K Weakest Rows in a Matrix

package EasyQuestions.Matrix;

import java.util.*;

public class KWeakestRowsInAMatrix {
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
        int k = sc.nextInt();
        int[] result = KWeakestRowsInAMatrix(matrix, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] KWeakestRowsInAMatrix(int[][] matrix, int k) {
        int[] countArr = new int[matrix.length];
        ArrayList<Integer> sortedArr = new ArrayList<>();

        // count soliders
        for (int i = 0; i < matrix.length; i++) {
            int countSoilders = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    countSoilders++;
                } else {
                    break;
                }
            }
            countArr[i] = countSoilders;
            sortedArr.add(i);
        }

        // sort array
        for (int i = 1; i < countArr.length; i++) {
            int app = i;
            for (int j = i - 1; j >= 0; j--) {
                if (countArr[i] < countArr[j]) {
                    app--;
                }
            }
            sortedArr.remove(i);
            sortedArr.add(app, i);
        }

        // print kth array
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = sortedArr.get(i);
        }
        return res;
    }
}