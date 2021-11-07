class Solution {
   public void solveSudoku(char[][] board) {
       solve(board, 0, 0);
   }

   public boolean solve(char[][] board, int row, int col) {
       if (col == board[0].length) {
           col = 0;
           row += 1;
       }
       if (row == board.length) {
           return true;
       }
       if (board[row][col] != '.') return solve(board, row, col+1);
       for (char num = '1'; num <= '9'; num++) {
           if (checkIfValid(board, row, col, num)) {
               board[row][col] = num;
               boolean solved = solve(board, row, col+1);
               if (solved) return true;
               else board[row][col] = '.';
           }
       }
       return false;
   }

   public boolean checkIfValid(char[][] board, int row, int col, char value) {
       for (int i = 0; i < board.length; i++) {
           if (board[i][col] == value) return false;
           if (board[row][i] == value) return false;
       }
       int boxRow = row / 3;
       int boxCol = col / 3;
       for (int i = boxRow * 3; i < (boxRow + 1) * 3; i++) {
           for (int j = boxCol * 3; j < (boxCol + 1) * 3; j++) {
               if (board[i][j] == value) return false;
           }
       }
       return true;
   }
}
