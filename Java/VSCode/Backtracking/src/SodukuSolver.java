public class SodukuSolver {
    public static void main(String[] args) {
        int[][] board = 
        {{2, 3, 0, 4, 1, 5, 0, 6, 8},
        {0, 8, 0, 2, 3, 6, 5, 1, 9},
        {1, 6, 0, 9, 8, 7, 2, 3, 4},
        {3, 1, 7, 0, 9, 4, 0, 2, 5},
        {4, 5, 8, 1, 2, 0, 6, 9, 7},
        {9, 2, 6, 0, 5, 8, 3, 0, 1},
        {0, 0, 0, 5, 0, 0, 1, 0, 2},
        {0, 0, 0, 8, 4, 2, 9, 0, 3},
        {5, 9, 2, 3, 7, 1, 4, 8, 6}};
        if(solve(board)) {
            display(board);
        }
        else {
            System.out.println("Cannot solve");
        }
    }
    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==0) {
                    row=i;
                    col=j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft==false) {
                break;
            }
        }
        if(emptyLeft==true) {
            return true;
        }
        for (int index = 1; index < 10; index++) {
            if(isSafe(board, row, col, index)) {
                board[row][col] = index;
                if(solve(board)) {
                    return true;
                }
                else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num) {
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==num) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]==num) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
