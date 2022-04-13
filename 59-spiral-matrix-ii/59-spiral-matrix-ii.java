class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int dir = 0;
        int count = 0;
        /*
        Directions
           0 - left to right
           1 - top to Bottom
           2 - right to left
           3 - Bottom to up
         */
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = ++count;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    matrix[i][right] = ++count;
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[down][i] = ++count;
                }
                down--;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    matrix[i][left] = ++count;
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return matrix;
    }
}