import java.util.ArrayList;

public class MazeProb3 {
    public static void main(String[] args) {
        System.out.println(printPath("",3, 3));
    }
    static ArrayList<String> printPath (String p,int row, int col) {
        if(row==1 && col==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = new ArrayList<>(),right = new ArrayList<>(),dia = new ArrayList<>();
        if(row>1) {
            left = printPath(p+'|',row-1, col);
        }
        if(col>1) {
            right = printPath(p+'-',row, col-1);
        }
        if(row>1&&col>1) {
            dia = printPath(p+'\\', row-1, col-1);
        }
        right.addAll(dia);
        left.addAll(right);
        return left;
    }
}

