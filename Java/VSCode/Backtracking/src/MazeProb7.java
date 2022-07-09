import java.util.Arrays;

public class MazeProb7 {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        int[][] path = new int[maze.length][maze[0].length];
        PrintPath1("",maze,0, 0,path,1);
    }
    static void PrintPath1(String p,boolean[][] maze, int row, int col,int[][] path,int step) {
        if(row==maze.length-1 && col==maze[0].length-1) {
            path[row][col] = step;
            for(int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
        }
        if(maze[row][col]) {
            return;
        }
        path[row][col]=step;
        maze[row][col]=true;
        if(row<maze.length-1) {
            PrintPath1(p+'D',maze,row+1, col,path,step+1);
        }
        if(col< maze[0].length-1) {
            PrintPath1(p+'R',maze,row, col+1,path,step+1);
        }
        if(row>0) {
            PrintPath1(p+'U',maze,row-1, col,path,step+1);
        }
        if(col>0) {
            PrintPath1(p+'L',maze,row, col-1,path,step+1);
        }
        path[row][col]=step;
        maze[row][col]=false;
    }
}