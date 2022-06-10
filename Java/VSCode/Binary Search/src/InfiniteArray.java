public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,10,15,19,20,25,45,51,62,68,70,77};
        int target = 25;
        System.out.println(findingRange(arr, target));

    }
    static int findingRange(int[] arr,int target) {
        int start = 0;
        int end = 1; 
        while(target>arr[end]){
            int newStart = end + 1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binsrch(arr, target, start, end);
    }
    static int binsrch(int[] arr,int target,int start, int end) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]) {
                end = mid - 1;
            }
            else if(target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
