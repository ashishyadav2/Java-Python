public class RotateCount {
    public static void main(String[] args) {
                int[] arr = {3,8,9,12,0,1,2};
                int target = 9;
                System.out.println(findPivot(arr)+1);
            }
            static int findPivot(int[] arr) {
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
                return - 1;
            }
}
