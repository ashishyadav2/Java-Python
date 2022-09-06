import java.util.Arrays;
public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrentt(nums)));
    }
    static int[] smallerNumbersThanCurrentt(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int count =0;
            for(int j =0;j<nums.length;j++) {
                if(nums[i]>nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
