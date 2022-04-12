class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
		int n = board[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				checkAndUpdate(board, i, j);
			}
		}
		// update board to change 2 to 1 and -1 to 0 back.
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// board[i][j] will be 1 if value is either 1 or 2. else it will be 0
				board[i][j] = board[i][j] >= 1 ? 1 : 0;
			}
		}
	}

	private void checkAndUpdate(int[][] board, int i, int j) {
		int m = board.length;
		int n = board[0].length;
		int count = 0;
		int[][] indexes = { { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
		// try every possible direction and count no of 1 or -1.
		for (int[] index : indexes) {
			if (i + index[0] < 0 || i + index[0] >= m || j + index[1] < 0 || j + index[1] >= n) {
				continue;
			}
			// if neighbor is either 1 or -1. Increment count.
			if (Math.abs(board[i + index[0]][j + index[1]]) == 1) {
				count++;
			}
		}
		// if current board element is 0 and count 3 it means it's new value will be 1
		// in future. hence make it 2.
		if (board[i][j] == 0 && count == 3) {
			board[i][j] = 2;
		} else if (board[i][j] == 1 && (count < 2 || count > 3)) {
			// if current element is 1 and count is <2 or > 3. it means it's new value will
			// be 0 in future.hence make it -1.
			board[i][j] = -1;
		}
    }
}