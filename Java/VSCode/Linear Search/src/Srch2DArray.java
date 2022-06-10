import java.rmi.server.RemoteRef;
import java.util.Arrays;

public class Srch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,3,665,125},
                {6,20,9,98},
                {63,4,84}
        };
        int[] ans = srch(arr, 125);
        System.out.println(Arrays.toString(ans));
    }
    static int[] srch(int[][] arr,int target) {
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
