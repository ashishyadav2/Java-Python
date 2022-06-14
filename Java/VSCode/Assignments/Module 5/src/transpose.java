import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tMat = transposeMat(matrix);
        for(int[] arr: tMat) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] transposeMat(int[][] matrix) {
        int[][] tMat = new int[matrix.length][matrix.length];
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix.length;col++) {
                tMat[row][col] = matrix[col][row];
            }
        }
        return tMat;
    }
}
