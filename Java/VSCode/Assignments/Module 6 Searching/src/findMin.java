public class findMin {
    public static void main(String[] args) {
        int[] nums = {1,1,3};
        System.out.println(find(nums));
    }
    static int find(int[] nums) {
        if(findmin(nums)==nums.length-1) {
            return nums[0];
        }
        int temp = findmin(nums)+1;
        return nums[temp];
    }
    static int findmin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if(nums[start]==nums[mid]&&nums[mid]==nums[end]&&start<nums.length-1) {
                if(nums[start]>nums[start+1]) {
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid]||(nums[start]==nums[mid]&&nums[mid]>nums[end])) {
                start = mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return nums.length-1;
    }
}
