import java.util.Arrays;

public class matrixReshape {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        int r=1;
        int c=4;
        int[][] ans = new int[r][c];
        ans = reshape(matrix,r,c);
        for(int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] reshape(int[][] matrix,int r,int c) {
        int[][] result = new int[r][c];
        int k=0;
        if((r*c) != (matrix.length*matrix[0].length)) {
            return matrix;
        }
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                int ro = k/c;
                int co = k%c;
                result[ro][co] = matrix[row][col];
                k++;
            }
        }
        return result;
    }
}
