import java.util.ArrayDeque;
import java.util.ArrayList;

public class MazeProb5 {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        maze[1][1] = true;
        System.out.println(MazeWithObs("",maze,0, 0));
    }
    static ArrayList<String> MazeWithObs (String p,boolean[][] maze, int row, int col) {
        if(row==maze.length-1 && col==maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(maze[row][col]) {
            return new ArrayList<>();
        }
        ArrayList<String> left = new ArrayList<>(),right = new ArrayList<>();
        if(row<maze.length-1) {
            left = MazeWithObs(p+'D',maze,row+1, col);
        }
        if(col< maze[0].length-1) {
            right = MazeWithObs(p+'R',maze,row, col+1);
        }
        left.addAll(right);
        return left;
    }
}

