import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        knights(board,0, 0,4);
    }
    static void knights(boolean[][] board,int row ,int col,int knight) {
       if(knight==0) {
           display(board);
           System.out.println();
           return;
       }
       if(row==board.length-1&&col==board.length-1) {
           return;
       }
       if(col==board.length-1) {
           knights(board, row+1, 0, knight);
           return;
       }
       if(isSafe(board,row,col)) {
           board[row][col] = true;
           knights(board, row, col+1, knight-1);
           board[row][col] = false;
       }
       knights(board, row, col+1, knight);
    }
    static boolean isSafe(boolean[][] board,int row,int col) {
        if(isValid(board, row-2, col-1)) {
            if(board[row-2][col-1]) {
                return false;
            }
        }
        if(isValid(board, row-2, col+1)) {
            if(board[row-2][col+1]) {
                return false;
            }
        }
        if(isValid(board, row-1, col+2)) {
            if(board[row-1][col+2]) {
                return false;
            }
        }
        if(isValid(board, row-1, col-2)) {
            if(board[row-1][col-2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col) {
        if(row>0&&row<board.length&&col>0&&col<board.length) {
            return true;
        }
        return false;
    }
    static void display(boolean[][] board) {
        for(boolean[] arr: board) {
            for(boolean elem: arr) {
                if(elem) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
