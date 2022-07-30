public class searchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMat(matrix,target));
    }
    static boolean searchMat(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows*cols -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            int midRow = mid/cols;
            int midCol = mid%cols;
            if(matrix[midRow][midCol]==target) {
                return true;
            }
            else if(matrix[midRow][midCol]<target) {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return false;
    }
}
