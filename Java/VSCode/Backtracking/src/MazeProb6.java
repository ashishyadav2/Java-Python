import java.util.ArrayList;

public class MazeProb6 {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        System.out.println(MazeWithObs("",maze,0, 0));
        MazeWithObs1("",maze,0, 0);
    }
    static ArrayList<String> MazeWithObs(String p,boolean[][] maze, int row, int col) {
        if(row==maze.length-1 && col==maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(maze[row][col]) {
            return new ArrayList<>();
        }
        maze[row][col]=true;
        ArrayList<String> left = new ArrayList<>(),right = new ArrayList<>();
        if(row<maze.length-1) {
            left = MazeWithObs(p+'D',maze,row+1, col);
        }
        if(col< maze[0].length-1) {
            right = MazeWithObs(p+'R',maze,row, col+1);
        }
        if(row>0) {
            left = MazeWithObs(p+'U',maze,row-1, col);
        }
        if(col>0) {
            right = MazeWithObs(p+'L',maze,row, col-1);
        }
        maze[row][col]=false;
        left.addAll(right);
        return left;
    }
    static void MazeWithObs1(String p,boolean[][] maze, int row, int col) {
        if(row==maze.length-1 && col==maze[0].length-1) {
            System.out.println(p);
        }
        if(maze[row][col]) {
            return;
        }
        maze[row][col]=true;
        if(row<maze.length-1) {
            MazeWithObs1(p+'D',maze,row+1, col);
        }
        if(col< maze[0].length-1) {
            MazeWithObs1(p+'R',maze,row, col+1);
        }
        if(row>0) {
            MazeWithObs1(p+'U',maze,row-1, col);
        }
        if(col>0) {
            MazeWithObs1(p+'L',maze,row, col-1);
        }
        maze[row][col]=false;
    }
}

