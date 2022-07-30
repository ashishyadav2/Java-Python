public class findInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 1;
        System.out.println(binSrch(target,nums));
        System.out.println(findPeak(nums));
    }
    static int binSrch(int target,int[] nums) {
        int temp = findPeak(nums);
        int start = 0;
        if(nums[start]<nums[temp]) {
            int end = temp;
            int mid = start + (end-start)/2;
            while(start<= end) {
                if(target>nums[mid]) {
                    start = mid+1;
                }
                else if(target<nums[mid]) {
                    end = mid-1;
                }
                else {
                    return mid;
                }
            }
        }
        else {
            int startt = temp+1;
            int end= nums.length-1;
            int mid = startt + (end-start)/2;
            while(startt<= end) {
                if(target>nums[mid]) {
                    end = mid-1;
                }
                else if(target<nums[mid]) {
                    startt = mid+1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]) {
                start= mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
