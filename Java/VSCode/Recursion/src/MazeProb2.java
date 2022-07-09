import java.util.ArrayList;
import java.util.List;

public class MazeProb2 {
    public static void main(String[] args) {
        System.out.println(printPath("",3, 3));
    }
    static ArrayList<String> printPath (String p,int row, int col) {
        if(row==1 && col==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = new ArrayList<>(),right = new ArrayList<>();
        if(row>1) {
            left = printPath(p+'D',row-1, col);
        }
        if(col>1) {
            right = printPath(p+'R',row, col-1);
        }
        left.addAll(right);
        return left;
    }
}

