import java.util.Arrays;
public class findPeakGrid {
    public static void main(String[] args) {
        // int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        int[][] mat = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGridd(mat)));
    }
    static int[] findPeakGridd(int[][] mat) {
        int max = -1;
        int i =0,j=0;
        for(i=0;i<mat.length;i++) {
            int temp = findPeak1D(mat[i]);
            if(temp>max) {
                max = temp;
                j = i;
            }
        }
        return new int[]{j,max};
        // return new int[]{-1,-1};
    }
    static int findPeak1D(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid >start && arr[mid-1]>arr[mid]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr.length-1;
    }
}
