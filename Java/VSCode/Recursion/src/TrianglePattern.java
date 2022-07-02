public class TrianglePattern {
    public static void main(String[] args) {
        while(true) {;
            starPatt2(10, 0);
        }
    }
    static void starPatt(int row,int col) {
        if(row==0) {
            return;
        }
        if(col<row) {            
            System.out.print("* ");
            starPatt(row, col+1);
        }
        else {
            System.out.println();
            starPatt(row-1, 0);
        }
    }
    static void starPatt2(int row,int col) {
        if(row==0) {
            return;
        }
        if(col<row) {            
            starPatt2(row, col+1);
            System.out.print("* ");
        }
        else {
            starPatt2(row-1, 0);
            System.out.println();
        }
    }
}
