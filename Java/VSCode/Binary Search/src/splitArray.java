public class splitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splArr(nums, m));
    }
    static int splArr(int[] nums,int m) {
        int start=0,end =0;
        for(int i=0;i<nums.length;i++) {
            start = Math.max(0, nums[i]);
            end += nums[i];
        }
        while(start<end) {
            int mid = start + (end-start)/2;
            int sum = 0;
            int pecies = 1;
            for(int num: nums) {
                if(sum+num > mid) {
                    sum = num;
                    pecies++;
                }
                else {
                    sum += num;
                }
            }
            if(pecies>m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
