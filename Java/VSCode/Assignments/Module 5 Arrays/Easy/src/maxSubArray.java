public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(nums));
    }
    //kadane's alogirthm for max subarray sum;
    static int sum(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum+= nums[i];
            if(sum<0) {
                sum =0;
            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
