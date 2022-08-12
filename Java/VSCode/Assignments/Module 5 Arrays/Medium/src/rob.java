public class rob {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int ans = robber(nums);
        System.out.println(ans);
    }
    static int robber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i=i+2) {
            sum += nums[i];
        }
        return sum;
    }
}
