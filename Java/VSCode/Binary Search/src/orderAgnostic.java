import java.lang.annotation.Target;

public class orderAgnostic {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 7;
        System.out.println("Element found at index: "+search(arr,target));
    }
    static int search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else {
                if(arr[start]<arr[end]) {
                    if(target>arr[mid]) {
                        start = mid +1 ;
                    }
                    else  {
                        end = mid - 1;
                    }
                }
                else {
                    if(target>arr[mid]) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
