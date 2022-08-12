import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 10;
        System.out.println(Arrays.toString(find(arr,target)));
    }
    static int[] find(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target==arr[mid]) {
                if(start<mid) {
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
            else if(target>arr[mid]) {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return new int[]{end,start};
    }
}
