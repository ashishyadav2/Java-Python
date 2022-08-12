import java.util.Arrays;

public class spiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(spiral(matrix)));
    }
    static int[] spiral(int[][] matrix) {
        int dir = 1;
        int top = 0;
        int bottom = matrix.length-1; 
        int left = 0;
        int right = matrix[0].length-1;
        int k=0;
        int[] ans = new int[matrix.length*matrix.length];
        while(top<=bottom&&left<=right) {
            if(dir==1) {
                for(int i=left;i<=right;++i) {
                    ans[k] = matrix[top][i];
                    k++;
                }
                ++top;
                dir = 2; 
            }
            else if(dir==2) {
                for(int i=top;i<=bottom;++i) {
                    ans[k] = matrix[i][right];
                    k++;
                }
                --right;
                dir = 3;
            }
            else if(dir==3) {
                for(int i=right;i>=left;--i) {
                    ans[k] = matrix[bottom][i];
                    k++;
                }
                --bottom;
                dir = 4;
            }
            else if(dir==4) {
                for(int i=bottom;i>=top;--i) {
                    ans[k] = matrix[i][left];
                    k++;
                }
                ++left;
                dir = 1;
            }
        }
        return ans;
    }
}
