import java.util.Arrays;

class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix =    {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        int target = 16;
        System.out.println(Arrays.toString(BinSrch2D(matrix, target)));
    }
    static int[] BinSrch2D(int[][] matrix,int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows*cols-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            int midRow = mid/cols;
            int midCol = mid%cols;
            System.out.println(mid+" "+midRow+" "+midCol);
            if(matrix[midRow][midCol]<target) {
                start = mid + 1;
            }
            else if(matrix[midRow][midCol]>target) {
                end = mid - 1;
            }
            else {
                return new int[]{midRow,midCol};
            }
        }
        return new int[]{-1,-1};
    }
}