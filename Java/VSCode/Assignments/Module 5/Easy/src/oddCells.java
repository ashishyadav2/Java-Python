import java.util.Arrays;

public class oddCells {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int[][] matrix = new int[row][col];
        int[][] indices ={{0,1},{1,1}};
        for(int[] arr: matrix) {
            for(int element : arr) {
                element =  0;
            }
        }
        int[][] matrixInc = incMatrix(matrix,indices);
        for(int[] arr: matrixInc) {
                System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] incMatrix(int[][] matrix,int[][] indices) {
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length-1;col++) {
                matrix[indices[row][0]][col] +=1;
                matrix[col][indices[row][1]] +=1;
            }
        }
        return matrix;
    }
}
