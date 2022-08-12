public class singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        singleNonDuplicate(nums);
    }
    static void singleNonDuplicate(int[] nums) {
        System.out.println(binSrch(nums, 10));
    }
    static boolean binSrch(int[] nums,int target) {
        int i=-1;
        if(i>nums.length) {
            return false;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target==nums[mid]) {
                if(binSrch(nums, nums[i+1])) {
                    return false;
                }
                return true;
            }
            else if(target>nums[mid]) {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return false;
    }
}