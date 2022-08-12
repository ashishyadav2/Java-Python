import java.util.Arrays;

public class setZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] ans = zero(matrix);
        for(int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] zero(int[][] matrix) {
        int k=0;
        int count = 0;
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                if(matrix[row][col]==0) {
                    count++;
                }
            }
        }
        int[] temprow = new int[count];
        int[] tempcol = new int[count];
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                if(matrix[row][col]==0) {
                    temprow[k] = row;
                    tempcol[k] = col;
                }
            }
        }
        for(int i=0;i<temprow.length;i++) {
            matrix = setZ(temprow[i],tempcol[i],matrix);
        }
        return matrix;
    }
    static int[][] setZ(int row,int col,int[][] matrix) {
        for(int r=0;r<matrix.length;r++) {
            for(int c=0;c<matrix[r].length;c++) {
                matrix[row][c] =0;
                matrix[r][col]=0;
            }
        }
        return matrix;
    }
}
