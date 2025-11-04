package solutions.array;

import solutions.Solution;

public class NQueens2 implements Solution {
    public int totalNQueens(int n) {
        int[] count = {0};
        int[][] board = new int[n][n];

        backtrack(board, 0, count);
        return count[0];
    }

    private void backtrack(int[][] board, int col, int[] count) {
        if (col == board.length) {
            count[0]++;
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 1;
                backtrack(board, col + 1, count);
                board[row][col] = 0;
            }
        }
    }

    private boolean isSafe(int row, int col, int[][] board) {
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }


    @Override
    public void run() {
        int[] testCases = {1, 2, 3, 4, 5, 6, 8};

        for (int n : testCases) {
            int solutions = totalNQueens(n);
            System.out.println("For n = " + n + ", Total number of distinct solutions: " + solutions);
            System.out.println("---------------------------");
        }
    }
}
