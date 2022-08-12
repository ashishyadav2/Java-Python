import java.util.Arrays;

public class generateMatrix {
    public static void main(String[] args) {
        int num = 3;
        int[][] ans = genMatrix(num);
        for(int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] genMatrix(int num) {
        int[][] matrix = new int[num][num];
        int[] tempArr = new int[num*num];
        for(int i=0;i<num*num;i++){
            tempArr[i] = i+1;
        }
        int top =0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length - 1;
        int dir = 1;
        int k = 0;
        while(top<=bottom&&left<=right) {
            if(dir==1) {
                for(int i=left;i<=right;++i) {
                    matrix[top][i] = tempArr[k];
                    k++;
                }
                ++top;
                dir = 2;

            }
            else if(dir==2) {
                for(int i=top;i<=bottom;++i) {
                    matrix[i][right] = tempArr[k];
                    k++;
                }
                --right;
                dir = 3;

            }
            else if(dir==3) {
                for(int i=right;i>=left;--i) {
                    matrix[bottom][i] = tempArr[k];
                    k++;
                }
                --bottom;
                dir = 4;

            }
            else if(dir==4) {
                for(int i=bottom;i>=top;--i) {
                    matrix[i][left] = tempArr[k];
                    k++;
                }
                ++left;
                dir = 3;

            }
        }
        return matrix;
    }
}
