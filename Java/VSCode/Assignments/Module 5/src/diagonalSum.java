public class diagonalSum {
    public static void main(String[] args) {
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum = getSum(matrix);
        System.out.println(sum);
    }
    static int getSum(int[][] matrix) {
        int grandTotal = 0;
        int diagonalSum1= 0;
        int diagonalSum2= 0;
        int end = matrix.length-1;
        for(int row=0;row<matrix.length;row++) {
            diagonalSum1 += matrix[row][row];
            diagonalSum2 += matrix[row][end-row];;
            grandTotal = diagonalSum1+diagonalSum2;
            if(matrix.length%2!=0) {
                int temp = end/2;
                grandTotal -= matrix[temp][temp];
            }
        }
        return grandTotal;
    }
}
