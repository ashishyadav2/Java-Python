import java.util.Arrays;

public class findRotation {
    public static void main(String[] args) {
        int[][] matrix = {{0,1},{1,1}};
        int[][] target = {{1,1},{1,1}};
        boolean ans = isRotatateable(matrix,target);
        System.out.println(ans);
    }
    static boolean isRotatateable(int[][] matrix,int target[][]) {
        int flag = 0;
        int[][] tempMat = rotateMat(matrix);
        // print2DMat(tempMat);
        boolean status = false;
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                if(tempMat[row][col]==target[row][col]) {
                    flag++;
                }
                else {
                    tempMat = rotateMat(tempMat);
                }
            }
        }
        if(flag==(matrix.length*matrix.length)) {
            return true;
        }
        return false;
    }
    static int[][] rotateMat(int[][] matrix) {
        int tempMat[][] = new int[matrix.length][matrix.length];
        for(int[] arr: tempMat) {
            for(int elem : arr) {
                elem = 0;
            }
        }
        int end = matrix.length-1;
        for(int row=0;row<tempMat.length;row++) {
            for(int col=0;col<tempMat[row].length;col++) {
                tempMat[col][end-row] = matrix[row][col];
            }
        }
        // print2DMat(tempMat);
        // System.out.println(" ");
        return tempMat;
    }
    static void print2DMat(int[][] matrix) {
        int[][] tempMat = matrix;
        for(int[] arr: tempMat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
