public class countNegatives {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNeg(grid));
    }
    static int countNeg(int[][] grid) {
        int count=0;
        for(int row=0;row<grid.length;row++) {
            for(int col=0;col<grid[row].length;col++) {
                if(grid[row][col]<0) {
                    count++;
                }
            }
        }
        return count;
    }
}
