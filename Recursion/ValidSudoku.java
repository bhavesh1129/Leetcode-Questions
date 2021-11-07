class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col, char num){
        //for row checking
        for(int i = col + 1; i < 9; i++){
            if(board[row][i] == num)
                return false;
        }
    
        //For col checking
        for(int i = row + 1; i < 9; i++){
            if(board[i][col] == num)
                return false;
        }
    
        //for 3*3 matrix
        int x = row - row % 3, y = col - col % 3;
        for(int i = x; i < x + 3; i++){
            for(int j = y; j < y + 3; j++){
                if(board[i][j] == num && !(i == row && j == col))
                    return false;
            }
        }   
        return true;
    }
}
